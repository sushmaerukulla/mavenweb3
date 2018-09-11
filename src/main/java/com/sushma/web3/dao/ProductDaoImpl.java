package com.sushma.web3.dao;

import java.util.List;

import javax.transaction.Transaction;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.sushma.web3.model.Category;
import com.sushma.web3.model.Product;
@Component
@Repository
public class ProductDaoImpl implements ProductDao
{
@Autowired
SessionFactory sessionFactory;
	public boolean insert(Product product) 
	{
		Session session=sessionFactory.openSession();
		
		session.save(product);
		org.hibernate.Transaction t=session.beginTransaction();
		t.commit();
		session.close();
		return false;
	}
public List getAllProducts()
{
	Session session=sessionFactory.openSession();
	Query query= session.createQuery("from Product");
	query.list();
	List productList=query.list();
	session.close();
	return productList;
	
}
@Override
public boolean deleteProduct(int id) {
	try
	{
		Session session=sessionFactory.openSession();
		Product pro=(Product)session.get(Product.class, id);
		session.delete(pro);
		org.hibernate.Transaction t=session.beginTransaction();
		t.commit();
		session.close();
	
	return true;
	}
	catch(Exception e)
	{
		return false;
		
	}
}
public Product editProduct(int id)
{
	Session session=sessionFactory.openSession();
	Product pro=(Product)session.get(Product.class, id);
	session.close();
	return pro;
}
public Product showDetails(int id)
{
	Session session=sessionFactory.openSession();
	Product pro=(Product)session.get(Product.class, id);
	session.close();
	return pro;
}
}
