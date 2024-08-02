package com.venkat.springboot.cloudconfigserver1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
/**
 * SpringBootCloundConfigServerApplication.
 *
 * @author venkataprasad.g
 * @version $Id: SpringBootCloundConfigServerApplication.java 24-Jul-2024 6:03:25 pm
 *
 * @since 1.0
 */
@SpringBootApplication
@EnableConfigServer
public class SpringBootCloundConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCloundConfigServerApplication.class, args);
	}

}
