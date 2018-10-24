package com.sushma.web3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sushma.web3.dao.ProductDao;
import com.sushma.web3.model.Product;




@Controller
public class HomeController 
{@Autowired
	ProductDao pdao;
Product p1=new Product();
	@RequestMapping("/user")
public ModelAndView mappinguser()
{
	

		ModelAndView mv=new  ModelAndView("user","prod",p1);
		List proList=pdao.getAllProducts();
		mv.addObject("product",proList);
		return mv;
		
}
	@RequestMapping("/home2")
	public ModelAndView homepage()
	{
		

		ModelAndView mv=new  ModelAndView("home2","prod",p1);
		List proList=pdao.getAllProducts();
		mv.addObject("product",proList);
		return mv;
			
			
	}
	@RequestMapping("/index")
	public ModelAndView mappingindex()
	{
		ModelAndView mv=new ModelAndView("index");
		return mv;
	}
}
