package com.cadastro.security;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.cadastro.service.UsuarioService;

@RestController
@CrossOrigin("*")
public class HomeController {
	
//@Autowired	
//private CreateUserService userService;

@GetMapping({"/","home"})
public String home() {
	return "index";
}
 @RequestMapping("login")
 public String login() {
	 return "login";
}
 @PreAuthorize("hasRole('ADMIN')")
 @GetMapping("/admin")
 public String admin() {
	 return "home";
 }
 @GetMapping ("/registrar")
 public String registrar() {
	 return "registration";
 }
 @PostMapping ("/createUser")
 public String Createuser(@ModelAttribute User user, HttpSession session) {
 
 User usuario = UsuarioService.execute(user);
 if (usuario !=null) {
	 session.setAttribute("msg", "Register Sucessfully");
	 }else {
		 session.setAttribute("msg", "Something wrong on server");
		 
	 }
	 return "redirect:/register";
}
}
