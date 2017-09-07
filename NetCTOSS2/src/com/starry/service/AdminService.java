package com.starry.service;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;

import com.starry.mapper1.AdminMapper;
import com.starry.pojo.Admin_info;
import com.starry.util.SessionUtil;

public class AdminService {
	static SqlSession session;
	public boolean isExist(String name,String pwd){
		Admin_info ad=null;
		try {
			session = SessionUtil.getSqlSession();
			AdminMapper mapper = session.getMapper(AdminMapper.class);
			Admin_info adi = new Admin_info();
			adi.setName(name);
			adi.setPassword(pwd);
			ad=mapper.findByName(adi);
			System.out.println(name+"======================name");
			System.out.println(pwd+"======================pwd");
			System.out.println(ad);
			if(ad!=null) {				
				return  true;
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
		
	}
}
