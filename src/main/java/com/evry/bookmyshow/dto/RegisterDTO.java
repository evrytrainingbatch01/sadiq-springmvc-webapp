package com.evry.bookmyshow.dto;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_register")
public class RegisterDTO implements Serializable {

	@Column(name = "name")
	private String name;
	@Column(name = "email")
	private String email;
	@Column(name = "password")
	private String password;

	@Id
	@GeneratedValue(strategy =GenerationType.SEQUENCE)
	@Column(name = "slNo")
	private int slNo;
	
	
	@JoinColumn(name="col")
	@OneToMany(cascade=CascadeType.ALL)
	private Collection<BookTicketDTO> bk;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getSlNo() {
		return slNo;
	}

	public void setSlNo(int slNo) {
		this.slNo = slNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Collection<BookTicketDTO> getBk() {
		return bk;
	}

	public void setBk(Collection<BookTicketDTO> bk) {
		this.bk = bk;
	}


}
