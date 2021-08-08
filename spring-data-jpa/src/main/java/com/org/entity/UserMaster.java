package com.org.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usermaster")
public class UserMaster {

	@Id
	@GeneratedValue
	private long id;
	@Column(nullable = false, length = 100)
	private String name;
	@Column(name = "age")
	private int age;
	@Column(name = "email")
	private String email;
	@Column(name = "address")
	private String address;
	@Column(name = "pin")
	private int pin;

	/*
	 * Hibernate uses the default constructor to create entity objects. If the
	 * default constructor is not available in any of the entities,
	 * InstantiationException: There was an unexpected error (type=Internal Server
	 * Error, status=500). will be thrown from hibernate
	 */
	public UserMaster() {
		super();
	}

	public UserMaster(long id, String name, int age, String email, String address, int pin) {
		// super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.email = email;
		this.address = address;
		this.pin = pin;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

}
