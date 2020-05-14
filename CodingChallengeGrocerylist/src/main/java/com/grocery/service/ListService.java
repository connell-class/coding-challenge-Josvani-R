package com.grocery.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grocery.model.GroceryList;
import com.grocery.repo.DaoContract;


public interface ListService {
	
	public GroceryList insert(GroceryList t);
	public GroceryList findByid(Integer id);
	public GroceryList update(GroceryList t);
	public GroceryList deleteById(Integer id);
	public List<GroceryList> getAll();
	
	

}
