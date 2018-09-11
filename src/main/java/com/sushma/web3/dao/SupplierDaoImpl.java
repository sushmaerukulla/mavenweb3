package com.sushma.web3.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.sushma.web3.model.Category;
import com.sushma.web3.model.Supplier;
@Component
@Repository
public class SupplierDaoImpl implements SupplierDao{

	@Autowired
	SessionFactory sessionFactory;
	public boolean insert(Supplier sup) {
		
		Session session=sessionFactory.openSession();
		session.save(sup);
		org.hibernate.Transaction t=session.beginTransaction();
		t.commit();
		session.close();
	
		return false;
	}
public List getAllSuppliers()
{
Session session=sessionFactory.openSession();
Query query= session.createQuery("from Supplier");
query.list();
List supplierList=query.list();
session.close();
return supplierList;
	
}
public boolean deleteSupplier(int supid) {
	try
	{
		Session session=sessionFactory.openSession();
	Supplier sup=(Supplier)session.get(Supplier.class, supid);
		session.delete(sup);
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
