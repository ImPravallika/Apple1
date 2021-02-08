package com.example.demo;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	
	public String getId(Integer id)
	
	{
	if(id ==101)
	{
		return "john";
	}
	else if(id==102)
	{
		
		return "Amit";
	}
		
	return "geetha";
		
		
	}

}
