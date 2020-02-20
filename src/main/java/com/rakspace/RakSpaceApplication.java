package com.rakspace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({ "com.rakspace" })
@SpringBootApplication
public class RakSpaceApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(RakSpaceApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(RakSpaceApplication.class, args);
	}
}
