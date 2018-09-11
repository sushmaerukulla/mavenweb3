package com.sushma.web3.controller;

	import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.sushma.web3.dao.CategoryDao;
import com.sushma.web3.dao.ProductDao;
import com.sushma.web3.dao.SupplierDao;
import com.sushma.web3.model.Category;
import com.sushma.web3.model.Product;
	@Controller
	public class ProductController 
	{
		@Autowired
		ProductDao productdao;
@Autowired
CategoryDao categorydao;
@Autowired
SupplierDao supplierdao;
		
		Product p1=new Product();
	
		@RequestMapping("/home1")
	public ModelAndView m1()
	{
			
			ModelAndView mv=new  ModelAndView("showproduct","prod",p1);
			List proList=productdao.getAllProducts();
			mv.addObject("product",proList);
			List catList=categorydao.getAllCategory();
			mv.addObject("category",catList);
			List supList=supplierdao.getAllSuppliers();
			mv.addObject("supplier",supList);
			return mv;
			
	}
		@RequestMapping(value="/addProduct", method=RequestMethod.POST)
		public ModelAndView insert(@ModelAttribute("prod") Product pro)
		{
			int id=(int)(Math.random()*10000);
			pro.setId(id);
			System.out.println(pro.getProname());
			productdao.insert(pro);
			List proList=productdao.getAllProducts();
			MultipartFile proImg=pro.getProductImg();
			System.out.println("subclass of mutlipart"+proImg.getClass().getName());
			File f=new File("F://mavenweb3\\src\\main\\webapp\\resources\\"+String.valueOf(id)+".jpg");
			try{
			FileOutputStream fos=new FileOutputStream(f);
			BufferedOutputStream bos=new BufferedOutputStream(fos);
			
				bos.write(proImg.getBytes());
			} catch (IOException e) {
			
			}
				
			return new ModelAndView("showproduct","product",proList);
		}
		@RequestMapping("/deletepro")
		public ModelAndView delete(@RequestParam("id") int productId)
		{
			productdao.deleteProduct(productId);
			List proList=productdao.getAllProducts();
			ModelAndView mv=new ModelAndView("showproduct","prod",new Product());
			mv.addObject("product",proList);
			return mv;
		}
		@RequestMapping("/editpro")
		public ModelAndView edit(@RequestParam("id") int productId)
		{
			Product pro=productdao.editProduct(productId);
			List proList=productdao.getAllProducts();
			ModelAndView mv=new ModelAndView("showproduct","prod",pro);
			mv.addObject("product",proList);
			return mv;
		}
		@RequestMapping("/showmoredetails")
		public ModelAndView show(@RequestParam("id") int productId)
		{

			Product pro=productdao.showDetails(productId);
			System.out.println(pro.getId());
			ModelAndView mv=new ModelAndView("show","product",pro);
			return mv;
		}
		
		
	}
	
		
