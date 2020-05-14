package com.grocery.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grocery.model.GroceryList;
import com.grocery.repo.ListRepo;
import com.grocery.service.ListService;

@Service
public class ListServiceImp implements ListService {
	
	@Autowired
	private ListRepo lp;

	@Override
	public GroceryList insert(GroceryList t) {
		return lp.save(t);
	}

	@Override
	public GroceryList findByid(Integer id) {
		return lp.getOne(id);
	}

	@Override
	public GroceryList update(GroceryList t) {
		return lp.save(t);
	}

	@Override
	public GroceryList deleteById(Integer id) {
		GroceryList t = lp.getOne(id);
		lp.delete(t);
		return t;
	}

	@Override
	public List<GroceryList> getAll() {
		return lp.findAll();
	}

}
