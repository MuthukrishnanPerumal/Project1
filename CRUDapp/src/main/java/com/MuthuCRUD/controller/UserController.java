package com.MuthuCRUD.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.MuthuCRUD.dao.UserDAO;
import com.MuthuCRUD.model.Userinfo;



@Controller
public class UserController {
	@Autowired
	public BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Autowired(required=true)	
	UserDAO userdao;
	
	@GetMapping("/login")
	public String login()
	{
		return "login.jsp";
	}
	
	@RequestMapping("/index")
	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	public String user()
	{
		return "Index.jsp";
	}
	@RequestMapping("/index1")
	@PreAuthorize("hasAuthority('ROLE_USER')")
	public String Admin()
	{
		return "New User.jsp";
	}
	
	@RequestMapping("addUser")
	public String user(Userinfo userinfo)
	{	
		userinfo.setPassword(bCryptPasswordEncoder.encode(userinfo.getPassword()));
		userdao.save(userinfo);
		return "Add.jsp";
	}
	/*@RequestMapping("addUser")
	public String encrypt(User user)
	{
		BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
		String encrypPwd=encoder.encode(user.getName());
		user.setName(encrypPwd);	
		User saveuser=userdao.save(user);
		
		
		return saveuser.getName()+"Added to database successfully";
	}*/
	@RequestMapping("updateUser")
	public ModelAndView updateUser(Userinfo user)
	{

		ModelAndView mav = new ModelAndView("Update.jsp");
		user=userdao.findById(user.getId()).orElse(new Userinfo()) ;
		userdao.deleteById(user.getId());
		mav.addObject(user);
		return mav;
	}
	
	@RequestMapping("UpdateSuccess")
	public String update(Userinfo user)
	{
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		userdao.save(user);
		return "UpdateSuccess.jsp";
	
	}
	
	@RequestMapping("Search")
	public ModelAndView Search(@RequestParam int id)
	{
		ModelAndView mav = new ModelAndView("showUser.jsp");
		Userinfo user=userdao.findById(id).orElse(new Userinfo()) ;
		mav.addObject(user);
		return mav;
	}
	
	
	@RequestMapping("deleteUser")
	public ModelAndView deleteUser(@RequestParam int id)
	{
		ModelAndView mav = new ModelAndView("deleteUser.jsp");
		Userinfo user=userdao.findById(id).orElse(new Userinfo()) ;
		userdao.deleteById(id);
		mav.addObject(user);
		return mav;
	}
	
	

}
