package com.grocery.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
@Entity
@Table(name = "list")
public class GroceryList {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@OneToMany(mappedBy = "list", cascade = { CascadeType.ALL })
	private Set<GroceryItem> groceryItems;
	
	@Column
	@NotBlank(message = "add a name to your list")
	private String listname;
	
	
	

	public GroceryList() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GroceryList(int id, Set<GroceryItem> groceryItems,
			@NotBlank(message = "add a name to your list") String listname) {
		super();
		this.id = id;
		this.groceryItems = groceryItems;
		this.listname = listname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Set<GroceryItem> getGroceryItems() {
		return groceryItems;
	}

	public void setGroceryItems(Set<GroceryItem> groceryItems) {
		this.groceryItems = groceryItems;
	}

	public String getListname() {
		return listname;
	}

	public void setListname(String listname) {
		this.listname = listname;
	}

	@Override
	public String toString() {
		return "GroceryList [id=" + id + ", groceryItems=" + groceryItems + ", listname=" + listname + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((groceryItems == null) ? 0 : groceryItems.hashCode());
		result = prime * result + id;
		result = prime * result + ((listname == null) ? 0 : listname.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GroceryList other = (GroceryList) obj;
		if (groceryItems == null) {
			if (other.groceryItems != null)
				return false;
		} else if (!groceryItems.equals(other.groceryItems))
			return false;
		if (id != other.id)
			return false;
		if (listname == null) {
			if (other.listname != null)
				return false;
		} else if (!listname.equals(other.listname))
			return false;
		return true;
	}
	
	

}
