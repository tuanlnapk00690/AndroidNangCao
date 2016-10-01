package com.model;

import java.io.Serializable;

public class DanhBa implements Serializable{

	private int id;
	private String name;
	private String phone;
	
	public DanhBa() {
		super();
	}
	
	public DanhBa(int id, String name, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
	}

	public DanhBa(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}

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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	
}

