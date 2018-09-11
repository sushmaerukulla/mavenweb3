package com.sushma.web3.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

@Entity
public class Product
{   @Id   
	@Column(name="proId")
	private int id;    
@Column(name="proName")
 private String proname  ;  
@Column
	 private int proprice; 
@Column
	 private String procat;
@Column
private String prosup;
	public String getProsup() {
	return prosup;
}
public void setProsup(String prosup) {
	this.prosup = prosup;
}
	@Transient
	MultipartFile productImg;
	public MultipartFile getProductImg() {
		return productImg;
	}
	public void setProductImg(MultipartFile productImg) {
		this.productImg = productImg;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProname() {
		return proname;
	}
	public void setProname(String proname) {
		this.proname = proname;
	}
	public int getProprice() {
		return proprice;
	}
	public void setProprice(int proprice) {
		this.proprice = proprice;
	}
	public String getProcat() {
		return procat;
	}
	public void setProcat(String procat) {
		this.procat = procat;
	}
	   
	
}
