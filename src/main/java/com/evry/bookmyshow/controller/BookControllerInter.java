package com.evry.bookmyshow.controller;

import org.springframework.web.servlet.ModelAndView;

import com.evry.bookmyshow.dto.BookTicketDTO;
import com.evry.bookmyshow.dto.RegisterDTO;

public interface BookControllerInter {

	ModelAndView register(RegisterDTO dto);

	ModelAndView login(RegisterDTO dto);

	ModelAndView bookTicket(BookTicketDTO dto);

	
}
