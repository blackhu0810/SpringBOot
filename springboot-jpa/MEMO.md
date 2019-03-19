# Getting Started

### Springboot SpringDataJpa

add application.properties  
#mysql連線設定  
spring.datasource.url=jdbc:mysql://localhost:3306/springboot  
spring.datasource.username=springboot  
spring.datasource.password=springboot  
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver  
spring.http.encoding.force=true
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
        <!-- 		Spring Data JPA  使用-->
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>