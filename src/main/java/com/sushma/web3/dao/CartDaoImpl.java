package com.sushma.web3.dao;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.sushma.web3.model.Cart;
import com.sushma.web3.model.Product;
import com.sushma.web3.model.Register;
@Component
@Repository
public class CartDaoImpl implements CartDao{

	@Autowired
	SessionFactory sessionFactory;
	@Autowired
	HttpSession sessions;
	public boolean insert(int id,int quantity,String s)
{
Session session=sessionFactory.openSession();
Product pro=(Product)session.get(Product.class,id);
Cart cart=new Cart();
System.out.println(pro.getProname());
System.out.println(s);
cart.setCartUser(s);
		cart.setCartId((int)(Math.random()*10000));
		cart.setProductname(pro.getProname());
		cart.setProductprice(pro.getProprice());
		cart.setQuantity(quantity);
		cart.setTotalprice(quantity*cart.getProductprice());
		session.save(cart);
		org.hibernate.Transaction t=session.beginTransaction();
		t.commit();
		session.close();
		return true;
	}
	public List getAllCartProducts(String cartuser)
	{
		Session session=sessionFactory.openSession();
		Query query= session.createQuery("from Cart where cartuser=:cu");
		 query.setParameter("cu",cartuser);
		
	
		List cartList=query.list();
		session.close();
		return cartList;
		
	}
	

}
