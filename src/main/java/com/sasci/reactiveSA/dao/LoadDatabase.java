package com.sasci.reactiveSA.dao;

import java.util.UUID;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sasci.reactiveSA.model.Book;
import com.sasci.reactiveSA.repo.BookRepository;

import reactor.core.publisher.Flux;

@Configuration
public class LoadDatabase {

	@Bean
	CommandLineRunner init(BookRepository repository) {
		return args->{
			Flux.just(													
					new	Book(UUID.randomUUID().toString(),"Youth of Next Generation"),	
					new	Book(UUID.randomUUID().toString(),"Boosting with Good Behaviours for Our Children"),	
					new	Book(UUID.randomUUID().toString(),"One Day in the Future"))
			.flatMap(repository::save)
			.subscribe(System.out::println);
		};
	}
}
