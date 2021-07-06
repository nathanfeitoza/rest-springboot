package com.nathanfeitoza.springmysqltest;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@SpringBootApplication
public class SpringMysqlTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMysqlTestApplication.class, args);
	}

	// @Bean
    // public DataSource dataSource(){
    //     DriverManagerDataSource dataSource = new DriverManagerDataSource();
    //     dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
    //     dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/spring-test?useSSL=false");
    //     dataSource.setUsername("root");
    //     dataSource.setPassword("123456");
    //     return dataSource;
    // }
}
