package com.samark.flywaymysql;

import com.samark.flywaymysql.product.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@Slf4j
public class FlywayMysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlywayMysqlApplication.class, args);
	}
	@Bean
	public CommandLineRunner runner(ProductRepository repository) {
		return r -> log.info(repository.findAll().toString());
	}

}
