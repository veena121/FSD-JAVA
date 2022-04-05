package com.nmscinemas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.nmscinemas")
public class NmsCinemasApplication {

	public static void main(String[] args) {
		SpringApplication.run(NmsCinemasApplication.class, args);
	}

}
