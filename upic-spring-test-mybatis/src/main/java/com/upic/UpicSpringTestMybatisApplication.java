package com.upic;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.upic.mapper")
public class UpicSpringTestMybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(UpicSpringTestMybatisApplication.class, args);
	}
}
