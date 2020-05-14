package com.grocery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.grocery.model.GroceryItem;
import com.grocery.service.ItemService;

@RestController
@RequestMapping("/item")
@CrossOrigin
public class ItemController {
	
	@Autowired
	private ItemService is;
	
	@PostMapping
	public GroceryItem addItem(@RequestBody GroceryItem item) {
		return is.insert(item);
	}
	
	@DeleteMapping
	public void removeItem(@RequestParam("id") int id) {
		is.deleteById(id);
	}
	
	@GetMapping
	public List<GroceryItem> getItems(@RequestParam("id") int id){
		return is.getAllById(id);
	}
	
	@PostMapping("/update")
	public GroceryItem update(@RequestBody GroceryItem item) {
		return is.update(item);
	}

}
