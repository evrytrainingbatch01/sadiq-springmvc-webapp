package com.evry.bookmyshow.dto;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_ticket")
public class BookTicketDTO implements Serializable {

	@Column(name = "language")
	private String language;
	@Column(name = "movie")
	private String movie;
	@Column(name = "city")
	private String city;
	@Column(name = "date")
	private String date;
	@Column(name = "seats")
	private int seats;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name = "ticketNo")
	private int ticketNo;

	@JoinColumn(name="col")
	@ManyToOne(cascade = CascadeType.ALL)
	private RegisterDTO register;

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getMovie() {
		return movie;
	}

	public void setMovie(String movie) {
		this.movie = movie;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getTicketNo() {
		return ticketNo;
	}

	public void setTicketNo(int ticketNo) {
		this.ticketNo = ticketNo;
	}

	public RegisterDTO getRegister() {
		return register;
	}

	public void setRegister(RegisterDTO register) {
		this.register = register;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

}
