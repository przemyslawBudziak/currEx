package com.pb.currEx;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class CurrExApplication {
	private static final Logger log = LoggerFactory.getLogger(CurrExApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(CurrExApplication.class, args);
//		try {
//			// Create a RestTemplate object
//			RestTemplate restTemplate = new RestTemplate();
//
//			// Make a GET request to the API endpoint and retrieve the response data
//			String apiUrl = "http://api.nbp.pl/api/cenyzlota";
//			String response = restTemplate.getForObject(apiUrl, String.class);
//
//			// Print the response data
//			System.out.println(response);
//		} catch (Exception e) {
//			System.out.println("Error: " + e.getMessage());
//		}
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
//		String apiUrl = "http://api.nbp.pl/api/exchangerates/rates/a/usd/";
//		return args -> {
//			Reply reply = restTemplate.getForObject(apiUrl, Reply.class);
//			log.info(reply.toString());
//		};

		String apiUrlST = "http://localhost:8080/api/random";
		return args -> {
			Quote reply = restTemplate.getForObject(apiUrlST, Quote.class);
			log.info(reply.toString());
		};
	}
}
/*
http://localhost:8080/api/random
 */