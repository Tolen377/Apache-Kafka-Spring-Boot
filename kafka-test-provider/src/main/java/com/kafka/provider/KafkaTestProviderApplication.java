package com.kafka.provider;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class KafkaTestProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaTestProviderApplication.class, args);
	}

}
