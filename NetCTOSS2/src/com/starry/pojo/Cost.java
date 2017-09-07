package com.starry.pojo;

import java.io.Serializable;

/*
 * �ʷ���Ϣ�� ��COST��
 */
public class Cost implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/*
	 * ��Ա����
	 */
	private Integer cost_id;//�������ʷ�ID
	private String name;//�ʷ�����
	private Integer base_duration;//������ʱ��
	private Integer base_cost;//�¹̶��ѣ�������С��
	private Integer unit_cost;//��λ���ã�Ԫ/Сʱ��
	private String status;//0����ͨ��1����ͣ��
	private String descr;//���ʷ���Ϣ��˵��
	private String creatime;//��������
	private String startime;//��������
	private String cost_type;//��Ϣ������
	
	
	
	/*====================================================*/
	
	/*
	 * ���췽��
	 */
	public Cost() {
		super();
	}
	public Cost(Integer cost_id, String name, Integer base_duration, Integer base_cost, Integer unit_cost,
			String status, String descr, String creatime, String startime, String cost_type) {
		super();
		this.cost_id = cost_id;
		this.name = name;
		this.base_duration = base_duration;
		this.base_cost = base_cost;
		this.unit_cost = unit_cost;
		this.status = status;
		this.descr = descr;
		this.creatime = creatime;
		this.startime = startime;
		this.cost_type = cost_type;
	}
	
	
	/*====================================================*/
	
	/*
	 * ����
	 */
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
	public Integer getBase_duration() {
		return base_duration;
	}
	public void setBase_duration(Integer base_duration) {
		this.base_duration = base_duration;
	}
	public Integer getBase_cost() {
		return base_cost;
	}
	public void setBase_cost(Integer base_cost) {
		this.base_cost = base_cost;
	}
	public Integer getUnit_cost() {
		return unit_cost;
	}
	public void setUnit_cost(Integer unit_cost) {
		this.unit_cost = unit_cost;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDescr() {
		return descr;
	}
	public void setDescr(String descr) {
		this.descr = descr;
	}
	public String getCreatime() {
		return creatime;
	}
	public void setCreatime(String creatime) {
		this.creatime = creatime;
	}
	public String getStartime() {
		return startime;
	}
	public void setStartime(String startime) {
		this.startime = startime;
	}
	public String getCost_type() {
		return cost_type;
	}
	public void setCost_type(String cost_type) {
		this.cost_type = cost_type;
	}
	@Override
	public String toString() {
		return "Cost [cost_id=" + cost_id + ", name=" + name + ", base_duration=" + base_duration + ", base_cost="
				+ base_cost + ", unit_cost=" + unit_cost + ", status=" + status + ", descr=" + descr + ", creatime="
				+ creatime + ", startime=" + startime + ", cost_type=" + cost_type + "]";
	}
	
	
	
	
}
