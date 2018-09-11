package com.sushma.web3.dao;

import java.util.List;

import com.sushma.web3.model.Product;

public interface ProductDao {
boolean insert(Product product);
List getAllProducts();
boolean deleteProduct(int id);
Product editProduct(int id);
Product showDetails(int id);
}
