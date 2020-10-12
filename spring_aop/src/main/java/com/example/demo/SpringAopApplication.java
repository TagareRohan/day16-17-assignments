package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.ifaces.BookDao;

@SpringBootApplication
public class SpringAopApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(SpringAopApplication.class, args);
	
		BookDao dao=ctx.getBean(BookDao.class);
		
		System.out.println(dao.getClass());
		
		System.out.println(dao.add("two"));
		System.out.println(dao.findById());
		//System.out.println(dao.findAll());
		
		Object[] temp=dao.findAll();
		
		for(int i=0;i<temp.length;i++)
		{
			System.out.println(temp[i]);
		}
	
	}

}
