package com.example.manymap.model;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "item")
public class Item {
	private Integer id;
	private String name;
	private List<ProductItem> productItems = new LinkedList<>();
	
	public Item() {}
	
	@Id
	@GenericGenerator(name = "generator", strategy="increment")
	@GeneratedValue(generator = "generator")
	@Column(name = "item_id", nullable = false)
	
	public Integer getId() {
		return this.id;
	}
	
    public void setId(Integer id) {
        this.id = id;
    }
    
    @Column(name ="name")
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "pk.item")
    public List<ProductItem> getProductItems() {
    	return this.productItems;
    }	
    
    public void setProductItems(List<ProductItem> productItems) {
    	this.productItems = productItems;
    }
    
    
}
