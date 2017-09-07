package com.starry.pojo;

import java.io.Serializable;

/**
 * 业务信息表 （SERVICE）
 * @author Administrator
 *
 */
public class Service  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/*
	 * 成员变量
	 */
	private Integer service_id;//业务帐号ID
	private Integer account_id;//帐务帐号ID
	private String unix_host;//UNIX服务器IP地址
	private String os_username;//UNIX服务器的OS帐号
	private String login_passwd;//登录UNIX服务器的口令
	private String status;//0：开通；1：暂停；2：删除
	private String create_date;//创建日期，创建即开通
	private String pause_date;//暂停日期
	private String close_date;//删除日期
	private Integer cost_id;//资费编码
	
	private Account account;
	
	
	
	
	/*====================================================*/
	
	/*
	 * 构造方法
	 */
	public Service() {
		super();
	}
	
	public Service(Integer account_id, String unix_host, String os_username, String login_passwd, String status,
			String create_date, String pause_date, String close_date, Integer cost_id) {
		super();
		this.account_id = account_id;
		this.unix_host = unix_host;
		this.os_username = os_username;
		this.login_passwd = login_passwd;
		this.status = status;
		this.create_date = create_date;
		this.pause_date = pause_date;
		this.close_date = close_date;
		this.cost_id = cost_id;
	}

	public Service(Integer service_id, Integer account_id, String unix_host, String os_username, String login_passwd,
			String status, String create_date, String pause_date, String close_date, Integer cost_id) {
		super();
		this.service_id = service_id;
		this.account_id = account_id;
		this.unix_host = unix_host;
		this.os_username = os_username;
		this.login_passwd = login_passwd;
		this.status = status;
		this.create_date = create_date;
		this.pause_date = pause_date;
		this.close_date = close_date;
		this.cost_id = cost_id;
	}
	/*====================================================*/
	
	/*
	 * 属性
	 */
	
	
	public Integer getService_id() {
		return service_id;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public void setService_id(Integer service_id) {
		this.service_id = service_id;
	}

	public Integer getAccount_id() {
		return account_id;
	}

	public void setAccount_id(Integer account_id) {
		this.account_id = account_id;
	}

	public String getUnix_host() {
		return unix_host;
	}

	public void setUnix_host(String unix_host) {
		this.unix_host = unix_host;
	}

	public String getOs_username() {
		return os_username;
	}

	public void setOs_username(String os_username) {
		this.os_username = os_username;
	}

	public String getLogin_passwd() {
		return login_passwd;
	}

	public void setLogin_passwd(String login_passwd) {
		this.login_passwd = login_passwd;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCreate_date() {
		return create_date;
	}

	public void setCreate_date(String create_date) {
		this.create_date = create_date;
	}

	public String getPause_date() {
		return pause_date;
	}

	public void setPause_date(String pause_date) {
		this.pause_date = pause_date;
	}

	public String getClose_date() {
		return close_date;
	}

	public void setClose_date(String close_date) {
		this.close_date = close_date;
	}

	public Integer getCost_id() {
		return cost_id;
	}

	public void setCost_id(Integer cost_id) {
		this.cost_id = cost_id;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	/*====================================================*/
	
	/*
	 * 成员方法
	 */
	@Override
	public String toString() {
		return "Service [service_id=" + service_id + ", account_id=" + account_id + ", unix_host=" + unix_host
				+ ", os_username=" + os_username + ", login_passwd=" + login_passwd + ", status=" + status
				+ ", create_date=" + create_date + ", pause_date=" + pause_date + ", close_date=" + close_date
				+ ", cost_id=" + cost_id + "]";
	}
	
	
	
}
