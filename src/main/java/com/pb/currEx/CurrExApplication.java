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
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		String currency = "usd";
		String apiUrl = "http://api.nbp.pl/api/exchangerates/rates/a/" + currency;
		return args -> {
			NbpExchangeRate reply = restTemplate.getForObject(apiUrl, NbpExchangeRate.class);
			log.info(reply.toString());
		};
	}


}
