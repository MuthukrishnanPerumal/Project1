package com.Registration.Web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Registration.Service.UserService;
import com.Registration.Web.dto.UserRegistrationDto;
import com.Registration.model.User;

@Controller
@RequestMapping("/registration")
public class UserRegistrationController {
	
	
	private UserService userService;

	
	public UserRegistrationController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@ModelAttribute("user")
	public UserRegistrationDto userRegistrationDto() {
		return new UserRegistrationDto();
	}
	
	
	
	@GetMapping
	public String shoRegistrationForm() {
		return "registration";
	}
	
	@PostMapping
	public String registUserAccount(@ModelAttribute("user") UserRegistrationDto registrationDto) {
		System.out.println("Your name" + registrationDto.getName());
		System.out.println("Your password" + registrationDto.getPassword());
		userService.save(registrationDto);
		System.out.println("save after password" + registrationDto.getPassword());
		System.out.println("save after name" + registrationDto.getName());
		return "redirect:/registration?success";
	}


}
