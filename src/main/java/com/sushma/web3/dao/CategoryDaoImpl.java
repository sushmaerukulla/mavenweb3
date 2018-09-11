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
public class CategoryDaoImpl implements CategoryDao {

	@Autowired
	SessionFactory sessionFactory;
	public boolean insert(Category category) {
		Session session=sessionFactory.openSession();
		session.save(category);
		org.hibernate.Transaction t=session.beginTransaction();
		t.commit();
		session.close();
		return false;
	}

public List getAllCategory()
{
Session session=sessionFactory.openSession();
Query query= session.createQuery("from Category");
query.list();
List CategoryList=query.list();
session.close();
return CategoryList;
}
public boolean deleteCategory(int catid) {
	try
	{
		Session session=sessionFactory.openSession();
		Category cat=(Category)session.get(Category.class, catid);
		session.delete(cat);
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


}


