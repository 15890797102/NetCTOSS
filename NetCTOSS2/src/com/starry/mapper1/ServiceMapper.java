package com.starry.mapper1;

import java.util.List;

import com.starry.pojo.Account;
import com.starry.pojo.Page;
import com.starry.pojo.Service;

public interface ServiceMapper {
	
	/**
	 * ��ѯ����
	 */
	public List<Service> findAll1();
	/**
	 * 1����os�˺ţ�������IP�����֤�ţ�״̬�������а���ҵ��Id�����ҳ��ѯ�б�����
	 * ��ѯ������������  һ������������
	 */
	public Integer findAllById(Page page);
	/**
	 * 1����os�˺ţ�������IP�����֤�ţ�״̬�������а���ҵ��Id�����ҳ��ѯ�б�����
	 */
	public List<Service> findAll(Page page);
	
	
	/**
	 * ��ѯcost���е�id
	 */
	public Integer selectByCostId(String str);
	/**
	 * ����cost���е�cost_id
	 */
	public Integer updateCostById(Service service);
	
	/**
	 * �������֤�� ��ѯAccount_id
	 */
	public Integer selectAccountOut(String str);
	
	/**
	 * ����name ��ѯcost_id
	 */
	public Integer selectCostOut(String str);
	
	/**
	 * ����account_id ��ѯservice���е�����
	 * @param inte
	 * @return
	 */
	public List<Service> selectServiceByAcId(Integer inte);
	
	/**
	 * ���service
	 * @param service
	 */
	public void insertService(Service service);
	
	/**
	 * ����service_id����ɾ������
	 * @param service_id
	 */
	public void deleteService(Integer service_id);
}
