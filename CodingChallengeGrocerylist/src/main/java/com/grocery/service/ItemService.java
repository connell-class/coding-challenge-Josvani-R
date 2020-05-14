package com.grocery.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.grocery.model.GroceryItem;
import com.grocery.repo.DaoContract;

public interface ItemService {
	
	
	public GroceryItem insert(GroceryItem t);
	
	public GroceryItem update(GroceryItem t);
	
	public GroceryItem deleteById(Integer id);
	
	public List<GroceryItem> getAllById(Integer id);
}
