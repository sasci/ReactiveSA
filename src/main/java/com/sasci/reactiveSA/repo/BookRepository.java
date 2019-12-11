package com.sasci.reactiveSA.repo;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.sasci.reactiveSA.model.Book;

public interface BookRepository extends ReactiveCrudRepository<Book, String> {

}
