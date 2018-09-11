package com.sushma.web3.controller;




import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sushma.web3.dao.CategoryDao;

import com.sushma.web3.model.Category;
import com.sushma.web3.model.Product;
@Controller
public class CategoryController {
	@Autowired

	CategoryDao categorydao;
	
	
	Category c1=new Category();

	@RequestMapping("/category")
	public ModelAndView show()
	{
		ModelAndView mv= new ModelAndView("showcategory","pro",c1);
		List catList=categorydao.getAllCategory();
		mv.addObject("v3",catList);
		return mv;
	}
	@RequestMapping(value="/addCategory" ,method=RequestMethod.POST)
	public ModelAndView insert(@ModelAttribute("pro") Category cat)
	{
		categorydao.insert(cat);
		List catList=categorydao.getAllCategory();
		return new ModelAndView("showcategory","v3",catList);
	}
	@RequestMapping("/deletecat")
	public ModelAndView delete(@RequestParam("catid") int catid)
	{
		categorydao.deleteCategory(catid);
		List catList=categorydao.getAllCategory();
		ModelAndView mv=new ModelAndView("showcategory","pro",new Category());
		mv.addObject("v3",catList);
		return mv;
	}

}

