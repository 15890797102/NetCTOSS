package com.starry.pojo;

import java.io.Serializable;

/*
 * 管理员表 （ADMIN_INFO）
 */
public class Admin_info implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	private Integer admin_id;
	private String admin_code;
	private String password;
	private String name;
	private String telephone;
	private String email;
	private String enrolldate;
	
	
	public Admin_info() {
		super();
	}


	public Admin_info(Integer admin_id, String admin_code, String password, String name, String telephone, String email,
			String enrolldate) {
		super();
		this.admin_id = admin_id;
		this.admin_code = admin_code;
		this.password = password;
		this.name = name;
		this.telephone = telephone;
		this.email = email;
		this.enrolldate = enrolldate;
	}


	public Integer getAdmin_id() {
		return admin_id;
	}


	public void setAdmin_id(Integer admin_id) {
		this.admin_id = admin_id;
	}


	public String getAdmin_code() {
		return admin_code;
	}


	public void setAdmin_code(String admin_code) {
		this.admin_code = admin_code;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getTelephone() {
		return telephone;
	}


	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getEnrolldate() {
		return enrolldate;
	}


	public void setEnrolldate(String enrolldate) {
		this.enrolldate = enrolldate;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public String toString() {
		return "Admin_info [admin_id=" + admin_id + ", admin_code=" + admin_code + ", password=" + password + ", name="
				+ name + ", telephone=" + telephone + ", email=" + email + ", enrolldate=" + enrolldate + "]";
	}
	
	
	
	
	
}
