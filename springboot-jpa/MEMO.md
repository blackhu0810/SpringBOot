# Getting Started

### Springboot SpringDataJpa

創建table  
CREATE TABLE `USER` (  
       `ID` int(11) NOT NULL AUTO_INCREMENT,  
       `EMAIL` varchar(40) COLLATE utf8_unicode_ci DEFAULT NULL,  
       `PASSWORD` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,  
       `ADDRESS` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,  
       `CELLPHONE` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,  
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