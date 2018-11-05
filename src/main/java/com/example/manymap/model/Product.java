package com.example.manymap.model;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "product")
public class Product {
	@Id
	@GenericGenerator(name ="generator", strategy ="increment")
	@GeneratedValue(generator ="generator")
	@Column(name ="product_id", nullable =false)
    private Integer id;
    private String name;
    private List<ProductItem> productItems =new LinkedList<ProductItem>();
    
    
    
    public Integer getId() {
        return this.id;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy ="pk.product")
    public List<ProductItem> getProductItems() {
        return this.productItems;
    }
    
    public void setProductItems(List<ProductItem> productItems) {
        this.productItems = productItems;
    }
}
