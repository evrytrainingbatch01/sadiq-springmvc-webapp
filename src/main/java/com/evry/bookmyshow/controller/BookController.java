package com.evry.bookmyshow.controller;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.evry.bookmyshow.dto.BookTicketDTO;
import com.evry.bookmyshow.dto.RegisterDTO;
import com.evry.bookmyshow.service.BookService;
@SuppressWarnings("serial")
@RestController
public class BookController implements Serializable,BookControllerInter{

	@Autowired
	private BookService service;
	@Autowired
	private ModelAndView model;
	@PostMapping("/register.do")
	@Override
	public ModelAndView register(@ModelAttribute RegisterDTO dto) {

		//call the method using reference has a relation
		//ModelAndView model=new ModelAndView();
		service.register(dto);
		model.setViewName("registration");

		
		return model;
	}
	
	//For User Login
		
			@PostMapping("/login.do")
			@Override
			public ModelAndView login(@ModelAttribute RegisterDTO dto) {
				
				Long result=service.login(dto);
				
				//ModelAndView model=new ModelAndView();
				
				if(result==1)
				model.setViewName("LoginSuccess");
				else  model.setViewName("LoginFailed");
				
				return model;
			}
			
			
			@PostMapping("/bookTicket.do")
			@Override
			public ModelAndView bookTicket(@ModelAttribute BookTicketDTO dto) {
				
				service.bookTicket(dto);
				model.setViewName("book");
				return model;	
			}
			
	
}
