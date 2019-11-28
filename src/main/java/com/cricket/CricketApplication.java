package com.cricket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@ComponentScan(basePackages = {"com.cricket", "com.cricket.api", "com.cricket.config"})
public class CricketApplication {

	public static void main(String[] args) {
		SpringApplication.run(CricketApplication.class, args);
	}

}
