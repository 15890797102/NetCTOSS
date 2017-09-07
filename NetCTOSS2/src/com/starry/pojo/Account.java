package com.starry.pojo;

import java.io.Serializable;

/**
 * ������Ϣ��ACCOUNT��
 * �����Account���bean��
 * 
 * @author Administrator
 *
 */
public class Account implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/*
	 * ��Ա����
	 */
	private Integer account_id;//�����ʺ�ID
	private Integer recommender_id;//�Ƽ��������ʺ�ID
	private String login_name;//��¼NetCTOSSϵͳ�����ƣ������û��Է���
	private String login_passwd;//��¼NetCTOSS�Ŀ���
	private String status;//0����ͨ��1����ͣ��2��ɾ��
	private String create_date;//��������
	private String pause_date;//��ͣ���ڣ���ͨ״̬ʱΪ�գ�
	private String close_date;//ɾ������
	private String real_name;//�ͻ�����
	private String idcard_no;//���֤����
	private String birthdate;//��������
	private String gender;//�Ա�	0:�� 1:Ů
	private String occupation;//ְҵ
	private String telephone;//��ϵ�绰���������ֻ���
	private String email;//��������
	private String mailaddress;//�����ַ
	private String zipcode;//�ʱ�
	private String qq;//QQ
	private String last_login_time;//���һ�ε�¼ʱ��
	private String last_login_ip;//���һ�ε�¼IP��ַ
	
	/*====================================================*/
	
	/*
	 * ���췽��
	 */
	public Account() {
		super();
	}
	public Account(Integer recommender_id, String login_name, String login_passwd, String status, String create_date,
			String pause_date, String close_date, String real_name, String idcard_no, String birthdate,
			String gendateer, String occupation, String telephone, String email, String mailaddress, String zipcode,
			String qq, String last_login_time, String last_login_ip) {
		super();
		this.recommender_id = recommender_id;
		this.login_name = login_name;
		this.login_passwd = login_passwd;
		this.status = status;
		this.create_date = create_date;
		this.pause_date = pause_date;
		this.close_date = close_date;
		this.real_name = real_name;
		this.idcard_no = idcard_no;
		this.birthdate = birthdate;
		this.gender = gendateer;
		this.occupation = occupation;
		this.telephone = telephone;
		this.email = email;
		this.mailaddress = mailaddress;
		this.zipcode = zipcode;
		this.qq = qq;
		this.last_login_time = last_login_time;
		this.last_login_ip = last_login_ip;
	}
	public Account(Integer account_id, Integer recommender_id, String login_name, String login_passwd, String status,
			String create_date, String pause_date, String close_date, String real_name, String idcard_no,
			String birthdate, String gendateer, String occupation, String telephone, String email, String mailaddress,
			String zipcode, String qq, String last_login_time, String last_login_ip) {
		super();
		this.account_id = account_id;
		this.recommender_id = recommender_id;
		this.login_name = login_name;
		this.login_passwd = login_passwd;
		this.status = status;
		this.create_date = create_date;
		this.pause_date = pause_date;
		this.close_date = close_date;
		this.real_name = real_name;
		this.idcard_no = idcard_no;
		this.birthdate = birthdate;
		this.gender = gendateer;
		this.occupation = occupation;
		this.telephone = telephone;
		this.email = email;
		this.mailaddress = mailaddress;
		this.zipcode = zipcode;
		this.qq = qq;
		this.last_login_time = last_login_time;
		this.last_login_ip = last_login_ip;
	}
	
	/*====================================================*/
	/*
	 * ����
	 */
	public Integer getAccount_id() {
		return account_id;
	}
	public void setAccount_id(Integer account_id) {
		this.account_id = account_id;
	}
	public Integer getRecommender_id() {
		return recommender_id;
	}
	public void setRecommender_id(Integer recommender_id) {
		this.recommender_id = recommender_id;
	}
	public String getLogin_name() {
		return login_name;
	}
	public void setLogin_name(String login_name) {
		this.login_name = login_name;
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
	public String getReal_name() {
		return real_name;
	}
	public void setReal_name(String real_name) {
		this.real_name = real_name;
	}
	public String getIdcard_no() {
		return idcard_no;
	}
	public void setIdcard_no(String idcard_no) {
		this.idcard_no = idcard_no;
	}
	public String getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	public String getGendateer() {
		return gender;
	}
	public void setGendateer(String gendateer) {
		this.gender = gendateer;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
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
	public String getMailaddress() {
		return mailaddress;
	}
	public void setMailaddress(String mailaddress) {
		this.mailaddress = mailaddress;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getLast_login_time() {
		return last_login_time;
	}
	public void setLast_login_time(String last_login_time) {
		this.last_login_time = last_login_time;
	}
	public String getLast_login_ip() {
		return last_login_ip;
	}
	public void setLast_login_ip(String last_login_ip) {
		this.last_login_ip = last_login_ip;
	}
	
	/*====================================================*/
	/*
	 * ��Ա����
	 */
	@Override
	public String toString() {
		return "Account [account_id=" + account_id + ", recommender_id=" + recommender_id + ", login_name=" + login_name
				+ ", login_passwd=" + login_passwd + ", status=" + status + ", create_date=" + create_date
				+ ", pause_date=" + pause_date + ", close_date=" + close_date + ", real_name=" + real_name
				+ ", idcard_no=" + idcard_no + ", birthdate=" + birthdate + ", gendateer=" + gender + ", occupation="
				+ occupation + ", telephone=" + telephone + ", email=" + email + ", mailaddress=" + mailaddress
				+ ", zipcode=" + zipcode + ", qq=" + qq + ", last_login_time=" + last_login_time + ", last_login_ip="
				+ last_login_ip + "]";
	}
	
	
	
	
}
