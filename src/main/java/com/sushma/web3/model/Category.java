package com.sushma.web3.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Category {
	@Id
private int catid;
	@Column
private String catname;
	@Column
private String catdes;
public int getCatid() {
	return catid;
}
public void setCatid(int catid) {
	this.catid = catid;
}
public String getCatname() {
	return catname;
}
public void setCatname(String catname) {
	this.catname = catname;
}
public String getCatdes() {
	return catdes;
}
public void setCatdes(String catdes) {
	this.catdes = catdes;
}

}


