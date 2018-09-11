package com.sushma.web3.dao;

import java.util.List;

import com.sushma.web3.model.Category;

public interface CategoryDao {
boolean insert(Category category);

List getAllCategory();
boolean deleteCategory(int catid);
}
