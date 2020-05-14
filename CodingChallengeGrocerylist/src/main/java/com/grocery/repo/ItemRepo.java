package com.grocery.repo;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.grocery.model.GroceryItem;
import com.grocery.model.GroceryList;

@Repository
public interface ItemRepo extends JpaRepository<GroceryItem, Integer>{
	
	@Query("select i from GroceryItem i where i.list.id = ?1")
	public List<GroceryItem> getAllByListId(int id);
}
	
	