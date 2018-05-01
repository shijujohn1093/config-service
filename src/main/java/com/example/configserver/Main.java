package com.example.configserver;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		System.setProperty("user.home", "E:/dev");
		SpringApplication.run(Main.class, args);
	}
}
