package com.sushma.web3.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.sushma.web3.model.Product;

@Component
@Repository
public class OrderDaoImpl implements OrderDao{
	@Autowired
	SessionFactory sessionFactory;
	public boolean deleteCart(String user) {
		try
		{
			Session session=sessionFactory.openSession();
			Query query = session.createQuery("delete Cart where cartuser=:un");
	        query.setParameter("un", user);
	        query.executeUpdate();
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
