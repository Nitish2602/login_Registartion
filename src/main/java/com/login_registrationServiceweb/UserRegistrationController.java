package com.login_registrationServiceweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.login_registrationService.UserService;
import com.login_registrationServicewebdto.UserRegistartionDto;

@Controller
public class UserRegistrationController {
	private UserService userService;

	public UserRegistrationController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	
	@RequestMapping("/")
	public String index()
	{
		
		return "index";
	}
	
	@GetMapping("/login")
	public String login(@ModelAttribute("user") UserRegistartionDto registrationDto)
	{
	  System.out.println(registrationDto.getFirstName());
		return "index";
	}
	
	@PostMapping
	public String registrtaionUserAccount(@ModelAttribute("user") UserRegistartionDto registrationDto)
	{
		userService.save(registrationDto);
		return "redirect/registration?success";
	}

}
