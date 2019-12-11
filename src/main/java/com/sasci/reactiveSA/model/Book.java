package com.sasci.reactiveSA.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Book {
	@Id
	private String id;
	private String name;
	
	public Book(String id, String name) {
		this.id=id;
		this.name=name;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + "]";
	}
	
	
}
