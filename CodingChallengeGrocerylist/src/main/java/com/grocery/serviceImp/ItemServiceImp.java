package com.grocery.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grocery.model.GroceryItem;
import com.grocery.repo.ItemRepo;
import com.grocery.service.ItemService;

@Service
public class ItemServiceImp implements ItemService {
	
	@Autowired
	private ItemRepo ir;

	@Override
	public GroceryItem insert(GroceryItem t) {
		return ir.save(t);
	}

	@Override
	public GroceryItem update(GroceryItem t) {
		return ir.save(t);
	}

	@Override
	public GroceryItem deleteById(Integer id) {
		GroceryItem t = ir.getOne(id);
		ir.delete(t);
		return t;
	}

	@Override
	public List<GroceryItem> getAllById(Integer id) {
		return ir.getAllByListId(id);
	}
	
	
	
	

}
