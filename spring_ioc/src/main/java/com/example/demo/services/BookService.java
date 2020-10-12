package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Book;

@Component(value="kitabService")
public class BookService {

	@Autowired // field dependency injection
	@Qualifier("springAction")  //due to multiple beans specify one.
	private Book book;
	
	public double findDiscount()
	{
		return book.getPrice()*0.9;
	}
	
}
