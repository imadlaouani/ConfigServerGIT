package com.example.configservergit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigservergitApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigservergitApplication.class, args);
	}

}
