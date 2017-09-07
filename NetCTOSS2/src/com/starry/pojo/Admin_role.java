package com.starry.pojo;
import java.io.Serializable;

/*
 * 管理员角色表 （ADMIN_role）
 */
public class Admin_role implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer admin_id;//管理员ID
	private Integer role_id;//角色 ID
	
	
	public Admin_role() {
		super();
	}


	public Admin_role(Integer admin_id, Integer role_id) {
		super();
		this.admin_id = admin_id;
		this.role_id = role_id;
	}


	public Integer getAdmin_id() {
		return admin_id;
	}


	public void setAdmin_id(Integer admin_id) {
		this.admin_id = admin_id;
	}


	public Integer getRole_id() {
		return role_id;
	}


	public void setRole_id(Integer role_id) {
		this.role_id = role_id;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public String toString() {
		return "Admin_role [admin_id=" + admin_id + ", role_id=" + role_id + "]";
	}
	
	
	

}
