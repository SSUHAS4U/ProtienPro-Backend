package com.example.repository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.Interface.UserInterface;
import com.example.Model.User;



@Repository
public class DAO {
	
	@Autowired
	UserInterface repo;
	
	//Insert
	public void insert (User u1)
	{
		repo.save(u1);
	}
}