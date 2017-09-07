package com.starry.mapper1;

import com.starry.pojo.Admin_info;

public interface AdminMapper {
	
	/**
	 * 登录查询，查询数据库中账户是否存在
	 * @return
	 */
	public Admin_info findByName(Admin_info adif);
}
