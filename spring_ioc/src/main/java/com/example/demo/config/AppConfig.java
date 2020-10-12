package com.example.demo.config;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.demo.entity.Author;
import com.example.demo.entity.Book;
import com.example.demo.entity.Student;
import com.example.demo.services.StudentService;

@Configuration
public class AppConfig {

	
	@Bean
	public Book headFirst()
	{
		Book obj=new Book();
		obj.setBookId(101);
		obj.setBookName("HeadFirst");
		obj.setPrice(400.0);
		
		return obj;
	}
	
	
	@Bean
	public Book springAction()
	{
		return new Book(102,"temp",300.0,authorSuresh());
	}
	
	@Bean
	public Student getRam()
	{
		return new Student(100,"ram",95);
	}
	
	@Bean
	public Student getShyam()
	{
		return new Student(101,"shyam",87);
	}
	
	@Bean
	public Student getRaj()
	{
		return new Student(102,"raj",67);
	}
	
	@Bean
	public Author authorRamesh()
	{
		return new Author(201,"Ramesh","ram@abc.com");
	}
	
	@Bean
	public Author authorSuresh()
	{
		return new Author(202,"Suresh","sur@abc.com");
	}
	
}
