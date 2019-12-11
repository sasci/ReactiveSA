package com.sasci.reactiveSA.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sasci.reactiveSA.model.Book;
import com.sasci.reactiveSA.repo.BookRepository;

import reactor.core.publisher.Flux;

@RestController
public class BookController {

	
	private BookRepository repository;
	
	public BookController(BookRepository repository) {
		super();
		this.repository = repository;
	}

	@GetMapping("/books")
	public Flux<Book> listing() {
		return repository.findAll();
	}
}