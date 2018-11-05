package com.example.manymap.model;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "product_item")
@AssociationOverrides({
@AssociationOverride(
		name = "pk.item", 
		joinColumns = @JoinColumn(name = "item_id")),
@AssociationOverride(
		name = "pk.product",
		joinColumns = @JoinColumn(name = "product_id"))
				
})
public class ProductItem {
	
	private ProductItemPk pk = new ProductItemPk();
	
	 @EmbeddedId
	 private ProductItemPk getPk() {
	     return pk;
	 }

	 private void setPk(ProductItemPk pk) {
	      this.pk = pk;
	 }
	 
	 @Transient
	 public Item getItem() {
	     return getPk().getItem();
	 }
	 
	 public void setProduct(Product product) {
	        getPk().setProduct(product);
	    }
	 
	 public boolean equals(Object o) {
	        if (this== o) return true;
	        if (o ==null|| getClass() != o.getClass()) return false;

	        ProductItem that = (ProductItem) o;

	        if (getPk() !=null?!getPk().equals(that.getPk()) : that.getPk() !=null) return false;

	        return true;
	    }
	 
	 public int hashCode() {
	        return (getPk() !=null? getPk().hashCode() : 0);
	    }
}
