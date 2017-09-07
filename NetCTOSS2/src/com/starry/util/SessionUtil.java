package com.starry.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


/*
 * 创建session对象
 */
public class SessionUtil {
	public static void main(String[] args) throws IOException {
		getSqlSession();
		

		
	}

	
	
	/*
	 * 封装一个静态方法
	 */
	public static SqlSession getSqlSession() throws IOException {
		//创建路径--核心配置文件
		String path="SqlMapConfig.xml";
		//文件--Java流
		InputStream in=Resources.getResourceAsStream(path);
		//获取session对象
		SqlSessionFactoryBuilder sfb=new SqlSessionFactoryBuilder();
		SqlSessionFactory sf= sfb.build(in);
		//sf.getConfiguration().addMapper(UserMap.class);
		SqlSession session = sf.openSession();
		return session;
	}
	
	
}
