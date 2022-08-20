package com.accenture.lkm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
public class SpringBootAdminServer {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAdminServer.class, args);
	}
}
