package com.evry.bookmyshow.repo;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.evry.bookmyshow.dto.BookTicketDTO;
import com.evry.bookmyshow.dto.RegisterDTO;

@Repository
public class RegisterDAO implements RegisterDAOInter {
	@Autowired
	private SessionFactory sf;
	@Override
	public void register(RegisterDTO dto) {
		Session sess=sf.openSession();
		sess.beginTransaction();
		sess.save(dto);
		sess.getTransaction().commit();
	}
	
	@Override
	public long login(RegisterDTO dto) {
		Session sess=sf.openSession();
		String qry="select count(*) from RegisterDTO where email=:email and password=:password";
		Query query=sess.createQuery(qry);
		query.setParameter("email", dto.getEmail());
		query.setParameter("password", dto.getPassword());
		
		long res=(long) query.getSingleResult();
		
		
		return res;
		
	}
	@Override
	public void bookTicket(BookTicketDTO dto) {
		Session sess=sf.openSession();
		sess.beginTransaction();
		sess.save(dto);
		System.out.println("entering to book ticket");
		sess.getTransaction().commit();
	}

}
