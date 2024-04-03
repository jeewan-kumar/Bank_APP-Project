package com.jsp.bank_app.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name = "user_table")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	private long phone;
	private LocalDate DOB;
	@Enumerated(EnumType.STRING)
	private Role roel;
	private String  password;
	@OneToOne(cascade = CascadeType.ALL)
	private Address address;
	@OneToMany(mappedBy = "user")
	private List<Account> accounts;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public LocalDate getDOB() {
		return DOB;
	}
	public void setDOB(LocalDate dOB) {
		DOB = dOB;
	}
	public Role getRoel() {
		return roel;
	}
	public void setRoel(Role roel) {
		this.roel = roel;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<Account> getAccounts() {
		return accounts;
	}
	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}
	public User(int id, String name, String email, long phone, LocalDate dOB, Role roel, String password,
			Address address, List<Account> accounts) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		DOB = dOB;
		this.roel = roel;
		this.password = password;
		this.address = address;
		this.accounts = accounts;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
