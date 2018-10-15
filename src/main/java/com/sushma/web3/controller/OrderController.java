package com.sushma.web3.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sushma.web3.dao.CartDao;
import com.sushma.web3.dao.OrderDao;

@Controller
public class OrderController {
	@Autowired
	OrderDao orderdao;
	@Autowired
	HttpSession session;
	@Autowired
	CartDao cartdao;
	@RequestMapping("/cancelorder")
	public ModelAndView order(HttpSession session)
	{
		String s=(String)session.getAttribute("uname");
		orderdao.deleteCart(s);
		return new ModelAndView("cart");

	
			
	}
}
