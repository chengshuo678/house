package com.house.house;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = {"com.house.controller","com.house.service"})
@MapperScan(value = {"com.house.mapper"})
public class HouseApplication {
	public static void main(String[] args) {
		SpringApplication.run(HouseApplication.class, args);
	}
}
