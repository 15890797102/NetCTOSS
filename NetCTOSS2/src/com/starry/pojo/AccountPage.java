package com.starry.pojo;

public class AccountPage extends Page{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer idCardNo;//身份证号
	private String realName;//姓名
	private String loginName;//登录名
	private String status;//状态
	
	
	public AccountPage() {
		super();
	}
	public AccountPage(Integer idCardNo, String realName, String loginName, String status) {
		super();
		this.idCardNo = idCardNo;
		this.realName = realName;
		this.loginName = loginName;
		this.status = status;
	}
	public Integer getIdCardNo() {
		return idCardNo;
	}
	public void setIdCardNo(Integer idCardNo) {
		this.idCardNo = idCardNo;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "AccountPage [idCardNo=" + idCardNo + ", realName=" + realName + ", loginName=" + loginName + ", status="
				+ status + "]";
	}
	
	
	

}
