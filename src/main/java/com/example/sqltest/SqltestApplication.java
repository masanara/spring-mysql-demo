package com.example.sqltest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.actuate.trace.http.HttpTraceRepository;
import org.springframework.boot.actuate.trace.http.InMemoryHttpTraceRepository;

@SpringBootApplication
public class SqltestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SqltestApplication.class, args);
	}

        @Bean
        public HttpTraceRepository htttpTraceRepository() {
                return new InMemoryHttpTraceRepository();
	}
}
