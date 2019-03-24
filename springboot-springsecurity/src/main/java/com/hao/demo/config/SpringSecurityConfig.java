/**
 * 
 */
package com.hao.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author weihao
 *
 */
@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter
{

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception
	{
		PasswordEncoder pwdEncoder = new BCryptPasswordEncoder();
		auth.inMemoryAuthentication().passwordEncoder(pwdEncoder).withUser("admin").password(pwdEncoder.encode("admin")).roles("ADMIN", "MEMBER").and().withUser("Wayne").password(pwdEncoder.encode("12345678")).roles("MEMBER");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception
	{
		http.authorizeRequests().antMatchers("/admin").hasAnyRole("ADMIN").antMatchers("/member").hasRole("MEMBER").antMatchers("/user").authenticated().anyRequest().permitAll().and().formLogin().loginPage("/login").failureUrl("/login_page?error").and().logout().logoutUrl("/perform_logout").logoutSuccessUrl("/login_page?logout");
	}

}
