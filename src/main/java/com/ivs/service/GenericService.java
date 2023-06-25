package com.ivs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ivs.dao.GenericDao;

public class GenericService<Entity, IdType, Dao extends GenericDao<Entity, IdType>> implements GenericServiceItf<Entity, IdType> {
	
	@Autowired
	Dao dao;

	@Override
	public int insert(Entity entity) {
		return dao.insert(entity);
	}

	@Override
	public int update(Entity entity) {
		return dao.update(entity);
	}

	@Override
	public int delete(Entity entity) {
		return dao.delete(entity);
	}

	@Override
	public int deleteById(IdType id) {
		return dao.deleteById(id);
	}

	@Override
	public int deleteAll(IdType id) {
		return dao.deleteAll();
	}

	@Override
	public Entity select(IdType id) {
		return dao.select(id);
	}

	@Override
	public List<Entity> selectAll() {
		return dao.selectAll();
	}
	
	
}
