package com.starry.test;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.starry.mapper1.ServiceMapper;
import com.starry.pojo.Page;
import com.starry.pojo.Service;
import com.starry.util.SessionUtil;

public class TestService {
	SqlSession session;
	ServiceMapper mapper;
	@Before
	public void before() throws IOException {
		session= SessionUtil.getSqlSession();
		mapper=session.getMapper(ServiceMapper.class);
	}
	
	
	@After
	public void after() {
		session.commit();
		session.close();
		
	}
	
	/**
	 * 查询所有
	 */
	@Test
	public void findAll1() {

		List<Service> sers = mapper.findAll1();
		
		for(Service item:sers) {
			System.out.println(item.getAccount().getLogin_name());
		}
		
		
	}
	
	
	/**
	 * 根据os账号，服务器IP，身份证号，状态条件进行按照业务Id生序分页查询列表数据
	 */
	@Test
	public void findAll() {
		Page page=new Page();
		//传入查询的信息
		//value1:传入的OS账号
		//value2：传入的IP
		//value3:传入的身份证号
		String value1="guojing    ";
		String value1_1=value1.trim();
		
		page.setValue1(value1_1);
		
		String value2="    ";
		String value2_1=value2.trim();
		
		page.setValue2(value2_1);
		
		String value3="    ";
		String value3_1=value3.trim();
		
		page.setValue3(value3_1);
		//返回查询到的总数据条数
		Integer nub = mapper.findAllById(page);
		//从第几条数据开始显示
		page.setStartPage((page.getCurrentPage()-1)*page.getPageCount());
		//一共显示多少页数据
		int total=nub%page.getPageCount()==0?nub/page.getPageCount():nub/page.getPageCount()+1;
		page.setTotalPage(total);
	
		List<Service> sers = mapper.findAll(page);
		for(Service item:sers) {
			System.out.println(item.getAccount().toString());
		}		
	}
	
	/**
	 * 测试更新语句
	 */
	@Test
	public void selectByCostId() {
		int ss=mapper.selectByCostId("包月");
		Service se = new Service();
		se.setCost_id(ss);
		se.setService_id(2001);
		mapper.updateCostById(se);
	}
	/**
	 * 测试添加语句
	 */
	@Test
	public void insetService() {
		Integer account_id=mapper.selectAccountOut("330902197108270429");
		Integer cost_id=mapper.selectCostOut("包月");
		
		Service service=new Service();
		service.setAccount_id(account_id);
		service.setCost_id(cost_id);
		service.setOs_username("starry");
		service.setLogin_passwd("123456");
		service.setUnix_host("192.168.33.33");
		service.setStatus("1");
		mapper.insertService(service);
	
	}
	
	
	/**
	 * 删除操作Service
	 */
	@Test
	public void deleteService() {
		mapper.deleteService(3002);
	}
}
