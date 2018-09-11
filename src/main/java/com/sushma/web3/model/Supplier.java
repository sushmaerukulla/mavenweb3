package com.sushma.web3.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Supplier {
	@Id
private int supid;
	@Column
private String supname;
	@Column
private String supdes;
public int getSupid() {
	return supid;
}
public void setSupid(int supid) {
	this.supid = supid;
}
public String getSupname() {
	return supname;
}
public void setSupname(String supname) {
	this.supname = supname;
}
public String getSupdes() {
	return supdes;
}
public void setSupdes(String supdes) {
	this.supdes = supdes;
}

}
