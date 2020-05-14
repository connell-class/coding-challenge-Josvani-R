package com.grocery.repo;

import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grocery.model.GroceryList;

@Repository
public interface ListRepo extends JpaRepository<GroceryList, Integer>{



	
	
}
