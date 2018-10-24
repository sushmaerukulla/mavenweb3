package com.sushma.web3.controller;

import java.math.BigInteger;
import java.util.Collection;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sushma.web3.dao.AuthenticationDao;
import com.sushma.web3.dao.CartDao;
import com.sushma.web3.dao.ProductDao;
import com.sushma.web3.model.Register;

@Controller
public class AuthenticationController {
	@Autowired
	AuthenticationDao authdao;
	@Autowired
	ProductDao productdao;
	
	@Autowired
	CartDao cartdao;
	
	@Autowired
	HttpSession session;
	
	
	@RequestMapping("/register")
	public ModelAndView reg()
	{
			
			ModelAndView mv=new  ModelAndView("register","reg",new Register());
			return mv;
			
	}	
@RequestMapping("/addregister")
public ModelAndView insert(@ModelAttribute("reg") Register reg)
{
authdao.insert(reg);
List proList=productdao.getAllProducts();
return new ModelAndView("user","product",proList);
}
@RequestMapping("/login")
public ModelAndView maplogin()
{
		
		return new ModelAndView("login");
}	
//@RequestMapping("/addlogin")
public ModelAndView login(@RequestParam("un") String username,@RequestParam("pwd") String password)
{
		
		boolean result=authdao.login(username, password);
		List proList=productdao.getAllProducts();
		return new ModelAndView("user","product",proList);
		
		
}	
@RequestMapping("/LoginError")
public ModelAndView goLoginError()
{
	return new ModelAndView("LoginError");
}
@SuppressWarnings("unchecked")
@RequestMapping(value = "/login_session_attributes")
public String login_session_attributes(HttpSession session,Model model) {
	
    String username = SecurityContextHolder.getContext().getAuthentication().getName();
 System.out.println(username);
    Register  user = authdao.getUser(username);
    System.out.println("username ========"+user.getRole());
    session.setAttribute("uname", user.getUsername());
    session.setAttribute("name", user.getPassword());
    
    session.setAttribute("LoggedIn", "true");
    
    
     //session.setAttribute("cartcnt",count);
    Collection<GrantedAuthority> authorities;
    authorities= (Collection<GrantedAuthority>) SecurityContextHolder.getContext().getAuthentication().getAuthorities();
    String page="";
    String role="ROLE_USER";
    for (GrantedAuthority authority : authorities)
    {
      
         if (authority.getAuthority().equals(role))
         {
             session.setAttribute("UserLoggedIn", true);
             session.setAttribute("uname", username);
         page="/home2";
             session.setAttribute("test",1);
             String s=(String)session.getAttribute("uname");
         	List list=(List)cartdao.getAllCartProducts(s);
         	BigInteger n=cartdao.noOfRows(s);
         	session.setAttribute("rows", n);
            
         }
         else
         {
             session.setAttribute("Administrator",true);
             //session.setAttribute("UserName", user.getUsername());
             page="/index";
        
        }
    }
    return page;
}
}
