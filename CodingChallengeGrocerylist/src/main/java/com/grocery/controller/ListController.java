package com.grocery.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.grocery.model.GroceryList;
import com.grocery.service.ListService;

@RestController
@RequestMapping("/list")
@CrossOrigin
public class ListController {
	
	@Autowired
	private ListService ls;
	
	@PostMapping
	public String addList(@Valid @RequestBody GroceryList list, 
			BindingResult bindingResult){
		if (bindingResult.hasErrors()) {
			System.out.println("not vaild");
			return bindingResult.getFieldError().getField() + " " + bindingResult.getFieldError().getDefaultMessage();
		} else {
			ls.insert(list);
			return "New Grocery list created";
		}
	}
	
	@GetMapping
	public List<GroceryList> getAllList(){
		return ls.getAll();
	}
	
	@DeleteMapping
	public void removeList(@RequestParam("id") int id) {
		ls.deleteById(id);
	}
	
	@PostMapping("/update")
	public GroceryList update(@RequestParam("id") int id) {
		GroceryList gl = ls.findByid(id);
		return ls.update(gl);
	}
	@GetMapping("/items")
	public GroceryList getById(@RequestParam("id") int id) {
		return ls.findByid(id);
	}

}
