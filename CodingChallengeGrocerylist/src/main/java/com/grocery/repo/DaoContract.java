package com.grocery.repo;

import java.util.List;

public interface DaoContract <T,I> {
	T insert(T t);
	T findByid (I id);
	T update (T t);
	T deleteById(I id);
	List<T> getAllById(I id);
	List<T> getAll();
	

}
