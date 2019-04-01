package com.evry.bookmyshow.repo;

import com.evry.bookmyshow.dto.BookTicketDTO;
import com.evry.bookmyshow.dto.RegisterDTO;

public interface RegisterDAOInter {

	void register(RegisterDTO dto);

	long login(RegisterDTO dto);

	void bookTicket(BookTicketDTO dto);

}
