package com.sushma.web3.dao;

import java.math.BigInteger;
import java.util.List;

import com.sushma.web3.model.Cart;

public interface CartDao {
boolean insert(int id,int quantity,String s);
public List getAllCartProducts(String cartuser);
public BigInteger noOfRows(String cartuser);
}
