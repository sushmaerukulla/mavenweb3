package com.sushma.web3.controller;

import java.math.BigInteger;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpSession;

import com.sushma.web3.dao.CartDao;
import com.sushma.web3.dao.ProductDao;
import com.sushma.web3.model.Cart;
import com.sushma.web3.model.Product;

@Controller
public class CartController {
	@Autowired
	CartDao cartdao;
	@Autowired
	ProductDao productdao;
	@Autowired
	HttpSession session;
	@RequestMapping("/addtocart")
	public ModelAndView insert(@RequestParam("id") int id,@RequestParam("quantity") int quantity)
	{
	
	String username=(String)session.getAttribute("uname");
	System.out.println(username);
	
		cartdao.insert(id, quantity,username);
		List proList=productdao.getAllProducts();
		return new ModelAndView("user","product",proList);
		
	}
	
	@RequestMapping("/cart1")
	public ModelAndView show()
	{
	String s=(String)session.getAttribute("uname");
		List list=(List)cartdao.getAllCartProducts(s);
		//BigInteger n=cartdao.noOfRows(s);
		//session.setAttribute("rows", n);
		//System.out.println(n);
			return new ModelAndView("cart","cart",list);
			
	}
	
}
