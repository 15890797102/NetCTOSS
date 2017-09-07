package com.starry.pojo;

import java.io.Serializable;

/*
 * 角色权限表 （ROLE_PRIVILEGE）
 */
public class Role_modole  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer role_id;//角色ID
	private Integer module_id;//权限ID
	
	
	public Role_modole() {
		super();
	}


	public Role_modole(Integer role_id, Integer module_id) {
		super();
		this.role_id = role_id;
		this.module_id = module_id;
	}


	public Integer getRole_id() {
		return role_id;
	}


	public void setRole_id(Integer role_id) {
		this.role_id = role_id;
	}


	public Integer getModule_id() {
		return module_id;
	}


	public void setModule_id(Integer module_id) {
		this.module_id = module_id;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public String toString() {
		return "Role_modole [role_id=" + role_id + ", module_id=" + module_id + "]";
	}
	
	
	
}
