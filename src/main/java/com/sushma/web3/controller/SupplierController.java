package com.sushma.web3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sushma.web3.dao.CategoryDao;
import com.sushma.web3.dao.SupplierDao;
import com.sushma.web3.model.Category;
import com.sushma.web3.model.Supplier;
@Controller
public class SupplierController {
	@Autowired
SupplierDao supplierdao;
	
	


	@RequestMapping("/supplier")
	public ModelAndView show()
	{
		ModelAndView mv=new ModelAndView("supplier","sup",new Supplier());
		List supList=supplierdao.getAllSuppliers();
		mv.addObject("v3",supList);
		return mv;
	}
	@RequestMapping(value="/addSupplier", method=RequestMethod.POST)
	public ModelAndView insert(@ModelAttribute("sup") Supplier sup)
	{
		supplierdao.insert(sup);
		List supList=supplierdao.getAllSuppliers();
		return new ModelAndView("supplier","v3",supList);
	}
	@RequestMapping("/deletesup")
	public ModelAndView delete(@RequestParam("supid") int supid)
	{
		supplierdao.deleteSupplier(supid);
		List supList=supplierdao.getAllSuppliers();
		ModelAndView mv=new ModelAndView("supplier","sup",new Supplier());
		mv.addObject("v3",supList);
		return mv;
	}
}
