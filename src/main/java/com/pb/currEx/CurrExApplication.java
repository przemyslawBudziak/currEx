package com.pb.currEx;

import com.pb.currEx.model.ExchangeRate;
import com.pb.currEx.model.ExchangeRatesTable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;

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
		String date = "2022-02-09";
		String dateCurrent = "today";
		String apiUrl = "https://api.nbp.pl/api/exchangerates/rates/a/" + currency + "/" + date;
		String tableUrl = "https://api.nbp.pl/api/exchangerates/tables/a";

		return args -> {
			ExchangeRatesTable[] reply = restTemplate.getForObject(tableUrl, ExchangeRatesTable[].class);
			log.info(reply[0].toString());
		};
	}

//	@Bean
//	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
//		String currency = "usd";
//		String date = "2022-02-09"; // or lack of data
//		String dateCurrent = "today";
//		String apiUrl = "http://api.nbp.pl/api/exchangerates/rates/a/" + currency + "/" + dateCurrent;
//
//		return args -> {
//			ExchangeRate reply = restTemplate.getForObject(apiUrl, ExchangeRate.class);
//			log.info(reply.toString());
//		};
//	}


}


/*
----------------Single currency

 */

// todo deal with lack of data on some days