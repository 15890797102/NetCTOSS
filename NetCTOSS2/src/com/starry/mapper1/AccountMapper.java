package com.starry.mapper1;

import java.util.List;

import com.starry.pojo.Account;
import com.starry.pojo.AccountPage;
import com.starry.pojo.Page;

public interface AccountMapper {

	/**
	 * ��ѯaccount���е���������
	 * 
	 * @return ����һ������
	 */
	public Integer findAllPage();

	/**
	 * ������������ ��ѯaccount���е��������� Ȼ�󷵻�һ��
	 * 
	 * @return ����һ������
	 */
	public Integer findAllById(Page page);

	/**
	 * ������������ ��ѯaccount���е��������� Ȼ�󷵻�һ��
	 * 
	 * @return ����һ������
	 */
	public List<Account> findAllByRownum(Page page);

	/**
	 * ���ݴ����id ���и��²���
	 * 
	 * @param it
	 * @return
	 */
	public Integer updateById(Account acc);

	/**
	 * ����account�û���Ϣ
	 * 
	 * @param it
	 * @return
	 */
	public Integer addAccount(Account acc);

	/**
	 * ����idɾ���û���Ϣ
	 * 
	 * @param it
	 * @return
	 */
	public Integer deleteAccount(Integer idnum);
}
