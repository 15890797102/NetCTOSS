package com.starry.pojo;

import java.io.Serializable;

/*
 * ��ɫ�� ��ROLE_INFO��
 */
public class Role_info  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer cost_id;//��������ɫID
	private String name;//��ɫ����
	
	
	
	
	/*====================================================*/
	
	/*
	 * ���췽��
	 */
	public Role_info() {
		super();
	}
	public Role_info(Integer cost_id, String name) {
		super();
		this.cost_id = cost_id;
		this.name = name;
	}
	public Integer getCost_id() {
		return cost_id;
	}
	public void setCost_id(Integer cost_id) {
		this.cost_id = cost_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Role_info [cost_id=" + cost_id + ", name=" + name + "]";
	}
	
	
	
}
