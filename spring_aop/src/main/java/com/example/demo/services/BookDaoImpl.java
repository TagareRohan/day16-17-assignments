package com.example.demo.services;

import org.springframework.stereotype.Component;

import com.example.demo.ifaces.BookDao;

@Component
public class BookDaoImpl implements BookDao {

	@Override
	public int add(String str) {
		// TODO Auto-generated method stub
		return 23;
	}

	@Override
	public String findById() {
		// TODO Auto-generated method stub
		return "Ramesh";
	}

	@Override
	public String[] findAll() {
		// TODO Auto-generated method stub
		return new String[] {"ramesh","suresh"};
	}

}
