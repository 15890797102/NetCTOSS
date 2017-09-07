package com.starry.test;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.starry.mapper1.AccountMapper;
import com.starry.pojo.Account;
import com.starry.pojo.AccountPage;
import com.starry.pojo.Admin_info;
import com.starry.pojo.Page;
import com.starry.service.AdminService;
import com.starry.util.SessionUtil;

public class TestAccount {
	SqlSession session;
	@Before
	public void getSession() throws IOException {
		session = SessionUtil.getSqlSession();
	}
	
	@After
	public void SessionClose() {
		session.commit();
		session.close();	
	}
	
	/**
	 * 11111111111111111111111111111111111
	 * 根据三个参数     查询数据库中的信息。并分页显示出来
	 */
	@Test
	public void findAll(){
	
		AccountMapper mapper = session.getMapper(AccountMapper.class);
		Page page = new Page();
		//传入查询的信息
		//value1:传入的身份证号
		//value2：传入的姓名
		//value3:传入的登录名
		//value3:传入的状态码
		String value1="121    ";
		String value1_1=value1.trim();
		
		page.setValue1(value1_1);
		
		String value2="    ";
		String value2_1=value2.trim();
		
		page.setValue2(value2_1);
		
		String value3="    ";
		String value3_1=value3.trim();
		
		page.setValue3(value3_1);
		
		//返回查询到的总数据条数
		int nub= mapper.findAllById(page);
		//从第几条数据开始显示
		page.setStartPage((page.getCurrentPage()-1)*page.getPageCount());
		//一共显示多少页数据
		int total=nub%page.getPageCount()==0?nub/page.getPageCount():nub/page.getPageCount()+1;
		page.setTotalPage(total);
		
		List<Account> accounts=mapper.findAllByRownum(page);
		for(Account item:accounts) {
			System.out.println(item.toString());
		}
		
	}
	
	
	/**
	 * 根据id修改用户信息
	 * 
	 */
	@Test
	public void updateById() {
		AccountMapper mapper = session.getMapper(AccountMapper.class);
		Account acc= new Account();
		acc.setEmail("7953910@qq.com");
		acc.setAccount_id(1005);
		acc.setReal_name("张星宇");
		acc.setStatus("1");
		int s=mapper.updateById(acc);
		System.out.println(s);
	}
	
	/**
	 * 添加用户
	 * 
	 */
	@Test
	public void addAccount() {
		AccountMapper mapper = session.getMapper(AccountMapper.class);
		//Account acc= new Account(111, "111", "111", "111", "111", "111", "111", "111", "111", "111", "111", "111", "111", "111", "111", "111", "111", "111", "111");
		Account acc = new Account();
		acc.setEmail("7953910@qq.com");
		acc.setReal_name("张星宇");
		acc.setStatus("1");
		acc.setLogin_name("qq931222");
		
		mapper.addAccount(acc);
	
	}
	
	/**
	 * 删除用户
	 * 
	 */
	@Test
	public void deleteAccount() {
		AccountMapper mapper = session.getMapper(AccountMapper.class);
		//Account acc= new Account(111, "111", "111", "111", "111", "111", "111", "111", "111", "111", "111", "111", "111", "111", "111", "111", "111", "111", "111");
		
		Integer as=2005;
		mapper.deleteAccount(as);
	
	}
	
	
	@Test
	public void delete() {
		AdminService as = new AdminService();
		boolean ad=as.isExist("ADMIN", "111111");
		System.out.println(ad+"================================");
	}
}
