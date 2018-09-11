package com.sushma.web3.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cart
{@Id
	private int cartId;
@Column
	private int quantity;
@Column
	private int productprice;
@Column
	private String productname;
@Column
	private int totalprice;
@Column
private String cartUser;
public String getCartUser() {
	return cartUser;
}
public void setCartUser(String cartUser) {
	this.cartUser = cartUser;
}
public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getProductprice() {
		return productprice;
	}
	public void setProductprice(int productprice) {
		this.productprice = productprice;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public int getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(int totalprice) {
		this.totalprice = totalprice;
	}

}
