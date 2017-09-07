package com.starry.pojo;
import java.io.Serializable;

/*
 * 角色信息表 （Module_info）
 */
public class Module_info  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer module_id;//module_id
	private String name;//角色姓名
	
	
	
	
	public Module_info() {
		super();
	}
	public Module_info(Integer module_id, String name) {
		super();
		this.module_id = module_id;
		this.name = name;
	}
	public Integer getModule_id() {
		return module_id;
	}
	public void setModule_id(Integer module_id) {
		this.module_id = module_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Module_info [module_id=" + module_id + ", name=" + name + "]";
	}
	
	
	
}
