package com.grocery.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table
public class GroceryItem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String type;
	
	@OnDelete(action = OnDeleteAction.CASCADE)
	@ManyToOne
	@JoinColumn(name = "list_id")
	private GroceryList list;
	
	
	

	public GroceryItem() {
		super();
	}

	public GroceryItem(int id, String type, GroceryList list) {
		super();
		this.id = id;
		this.type = type;
		this.list = list;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public GroceryList getList() {
		return list;
	}

	public void setList(GroceryList list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "GroceryItem [id=" + id + ", type=" + type + ", list=" + list + "]";
	}
	
	
	
	
	

}
