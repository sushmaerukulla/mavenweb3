package com.sushma.web3.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.sushma.web3.model.Register;
@Component
@Repository
public class AuthenticationDaoImpl implements AuthenticationDao{

	@Autowired
	SessionFactory sessionFactory;
	public boolean insert(Register reg) {
Session session=sessionFactory.openSession();
		reg.setRole("ROLE_USER");
		reg.setEnabled(true);
		session.save(reg);
		org.hibernate.Transaction t=session.beginTransaction();
		t.commit();
		session.close();
		return false;
	
	}
	
	public boolean login(String email, String password) {
		try{
		Session session=sessionFactory.openSession();
		Query query = session.createQuery("From Register where email=:un and password=:pwd");
        query.setParameter("un", email).setParameter("pwd",password);
        Register reg=(Register)query.uniqueResult();
    	session.close();
		if(reg.getEmail()==email && reg.getPassword()==password)
		{
			return true;
		}
		}
		catch(Exception e)
		{
			System.out.println("failed");
		}

			return false;
}

	@Override
	public Register getUser(String username) {
		String hql="from Register where username=:uname";
		Session session=sessionFactory.openSession();
		Query query=session.createQuery(hql);
		query.setParameter("uname", username);
		Register register=(Register)query.uniqueResult();
		session.close();
		if(register!=null)
		{
			return register;
		}
		else
		{

		return null;
	}
}
}