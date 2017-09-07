package com.starry.mapper1;

import java.util.List;

import com.starry.pojo.Account;
import com.starry.pojo.AccountPage;
import com.starry.pojo.Page;

public interface AccountMapper {

	/**
	 * 查询account表中的所有数据
	 * 
	 * @return 返回一个集合
	 */
	public Integer findAllPage();

	/**
	 * 根据三个条件 查询account表中的所有数据 然后返回一个
	 * 
	 * @return 返回一个集合
	 */
	public Integer findAllById(Page page);

	/**
	 * 根据三个条件 查询account表中的所有数据 然后返回一个
	 * 
	 * @return 返回一个集合
	 */
	public List<Account> findAllByRownum(Page page);

	/**
	 * 根据传入的id 进行更新操作
	 * 
	 * @param it
	 * @return
	 */
	public Integer updateById(Account acc);

	/**
	 * 新增account用户信息
	 * 
	 * @param it
	 * @return
	 */
	public Integer addAccount(Account acc);

	/**
	 * 根据id删除用户信息
	 * 
	 * @param it
	 * @return
	 */
	public Integer deleteAccount(Integer idnum);
}
