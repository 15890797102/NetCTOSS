package com.starry.mapper1;

import com.starry.pojo.Admin_info;

public interface AdminMapper {
	
	/**
	 * ��¼��ѯ����ѯ���ݿ����˻��Ƿ����
	 * @return
	 */
	public Admin_info findByName(Admin_info adif);
}
