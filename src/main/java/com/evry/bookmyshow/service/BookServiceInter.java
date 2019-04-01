package com.evry.bookmyshow.service;

import com.evry.bookmyshow.dto.BookTicketDTO;
import com.evry.bookmyshow.dto.RegisterDTO;

public interface BookServiceInter {

	void register(RegisterDTO dto);

	long login(RegisterDTO dto);

	void bookTicket(BookTicketDTO dto);

}
