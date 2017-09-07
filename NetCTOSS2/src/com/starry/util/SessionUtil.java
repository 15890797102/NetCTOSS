package com.starry.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


/*
 * ����session����
 */
public class SessionUtil {
	public static void main(String[] args) throws IOException {
		getSqlSession();
		

		
	}

	
	
	/*
	 * ��װһ����̬����
	 */
	public static SqlSession getSqlSession() throws IOException {
		//����·��--���������ļ�
		String path="SqlMapConfig.xml";
		//�ļ�--Java��
		InputStream in=Resources.getResourceAsStream(path);
		//��ȡsession����
		SqlSessionFactoryBuilder sfb=new SqlSessionFactoryBuilder();
		SqlSessionFactory sf= sfb.build(in);
		//sf.getConfiguration().addMapper(UserMap.class);
		SqlSession session = sf.openSession();
		return session;
	}
	
	
}
