package com.ivs.dao;

import java.util.List;

public interface GenericDao<Entity, IdType> {
	public int insert(Entity entity);
	public int update(Entity entity);
	public int delete(Entity entity);
	public int deleteById(IdType id);
	public int deleteAll();
	public Entity select(IdType id);
	public List<Entity> selectAll();
}
