# Springboot Mybatis

創建table  
CREATE TABLE `Member` (  
            `ID` int(11) NOT NULL AUTO_INCREMENT,  
            `NAME` varchar(40) COLLATE utf8_unicode_ci DEFAULT NULL,  
            `AGE` int(3) COLLATE utf8_unicode_ci DEFAULT NULL,  
            `MONEY` int(11) COLLATE utf8_unicode_ci DEFAULT NULL,  
            `CREATE_DATE` datetime DEFAULT NULL,  
            PRIMARY KEY (`ID`)  
          ) ;  
***     
add application.properties  
#mysql連線設定  
spring.datasource.url=jdbc:mysql://localhost:3306/springboot  
spring.datasource.username=springboot  
spring.datasource.password=springboot  
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver  
spring.http.encoding.force=true

#mybatis xml 配置文件  
mybatis.mapper-locations=classpath:mapper/*.xml
***
add pom

		<!--   	MySQL的connector與Java對MySQL連線的API -->
    	<dependency>
		    <groupId>mysql</groupId>
		    <artifactId>mysql-connector-java</artifactId>
			<scope>runtime</scope>
		</dependency>

		<dependency>
		    <groupId>org.springframework.boot</groupId>
		    <artifactId>spring-boot-starter-jdbc</artifactId>
		</dependency>
        <!-- 		Mybatis  使用-->
		<dependency>
			<groupId>org.mybatis.spring.boot</groupId>
			<artifactId>mybatis-spring-boot-starter</artifactId>
			<version>2.0.0</version>
		</dependency>
