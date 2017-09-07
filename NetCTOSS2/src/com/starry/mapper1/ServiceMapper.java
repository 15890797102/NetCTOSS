package com.starry.mapper1;

import java.util.List;

import com.starry.pojo.Account;
import com.starry.pojo.Page;
import com.starry.pojo.Service;

public interface ServiceMapper {
	
	/**
	 * 查询所有
	 */
	public List<Service> findAll1();
	/**
	 * 1根据os账号，服务器IP，身份证号，状态条件进行按照业务Id生序分页查询列表数据
	 * 查询出来的是数字  一共多少条数据
	 */
	public Integer findAllById(Page page);
	/**
	 * 1根据os账号，服务器IP，身份证号，状态条件进行按照业务Id生序分页查询列表数据
	 */
	public List<Service> findAll(Page page);
	
	
	/**
	 * 查询cost表中的id
	 */
	public Integer selectByCostId(String str);
	/**
	 * 更新cost表中的cost_id
	 */
	public Integer updateCostById(Service service);
	
	/**
	 * 根据身份证号 查询Account_id
	 */
	public Integer selectAccountOut(String str);
	
	/**
	 * 根据name 查询cost_id
	 */
	public Integer selectCostOut(String str);
	
	/**
	 * 根据account_id 查询service表中的数据
	 * @param inte
	 * @return
	 */
	public List<Service> selectServiceByAcId(Integer inte);
	
	/**
	 * 添加service
	 * @param service
	 */
	public void insertService(Service service);
	
	/**
	 * 根据service_id进行删除操作
	 * @param service_id
	 */
	public void deleteService(Integer service_id);
}
