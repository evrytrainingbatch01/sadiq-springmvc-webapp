package com.evry.bookmyshow.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evry.bookmyshow.dto.BookTicketDTO;
import com.evry.bookmyshow.dto.RegisterDTO;
import com.evry.bookmyshow.repo.RegisterDAO;

@Service
public class BookService implements BookServiceInter{
	@Autowired
	private RegisterDAO dao;
	@Override
	public void register(RegisterDTO dto) {
		
		dao.register(dto);
		
	}
	
	@Override
	public long login(RegisterDTO dto) {
		long count=dao.login(dto);
		return count;
		
	}
	@Override
	public void bookTicket(BookTicketDTO dto) {
		System.out.println("entering into book ticket");
		dao.bookTicket(dto);
	}
	
}
