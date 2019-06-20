package com.hibernate.Demo.dao;

import java.util.List;

import com.hibernate.Demo.model.GroupBlockVo;

public interface GroupBlockDAO extends BaseDAO<GroupBlockVo>{
	
	GroupBlockVo getById(int id);
	List<GroupBlockVo> getAllBlocks();
	List<GroupBlockVo> getBlockByName(String name);
	
	
	
	

}
