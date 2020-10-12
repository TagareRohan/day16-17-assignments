package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


import com.example.demo.entity.Book;
import com.example.demo.services.BookService;
import com.example.demo.services.StudentService;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class SpringIocApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx= SpringApplication.run(SpringIocApplication.class, args);
	
		//Book obj=ctx.getBean("headFirst",Book.class);
		
//		Book ob=ctx.getBean("springAction",Book.class);
//		
//		//log.info(obj.toString());
////		System.out.println(obj.toString());
////		
////		System.out.println(ob.toString());
//		
//		BookService service=ctx.getBean(BookService.class);
//		
//		double discountPrice=service.findDiscount();
//
//		log.info(ob.toString());
//		log.info("dicount = "+discountPrice);
		
		StudentService service1=ctx.getBean(StudentService.class);
		log.info(service1.getStudents().toString());
	
	}

}
