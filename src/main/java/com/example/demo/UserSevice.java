package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserSevice {
	
	@Autowired
	private UserDao dao;
	@Autowired
	private ResultRepo repo;
	public void getInstance(Integer id)
	{
		
dao.getId(id)	;	
	}

	
	
}
