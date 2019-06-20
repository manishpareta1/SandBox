package com.hibernate.Demo.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.hibernate.Demo.model.GroupBlockVo;


public class GroupBlockDAOImpl extends BaseDAOImpl<GroupBlockVo> implements GroupBlockDAO{

	
	@Transactional
	public GroupBlockVo getById(int id) {
		Session session = null;
		try {
			session = getNewSession();
			Criteria criteria = session.createCriteria(GroupBlockVo.class)
					.add(Restrictions.eq("blkId", id));
			return (GroupBlockVo)criteria.list().get(0);
		}catch(RuntimeException rex) {
			System.out.println("Exception: "+rex.getMessage());
		}finally {
			closeSession(session);
		}
		return null;
	}

	public List<GroupBlockVo> getAllBlocks() {
		Session session = null;
		try {
			session = getNewSession();
			Criteria criteria = session.createCriteria(GroupBlockVo.class);
			return (List<GroupBlockVo>)criteria.list();
		}catch(RuntimeException rex) {
			System.out.println("Exception: "+rex.getMessage());
		}finally {
			closeSession(session);
		}
		return null;
	}

	public List<GroupBlockVo> getBlockByName(String name) {
		Session session = null;
		try {
			session = getNewSession();
			Criteria criteria = session.createCriteria(GroupBlockVo.class);
			return criteria.list();
		}catch(RuntimeException rex) {
			System.out.println("Exception: "+rex.getMessage());
		}finally {
			closeSession(session);
		}
		return null;
	}

	
}
