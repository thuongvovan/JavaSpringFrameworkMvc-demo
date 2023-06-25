package com.ivs.service;

import java.util.List;

public interface GenericServiceItf<Entity, IdType> {
	public int insert(Entity entity);
	public int update(Entity entity);
	public int delete(Entity entity);
	public int deleteById(IdType id);
	public int deleteAll(IdType id);
	public Entity select(IdType id);
	public List<Entity> selectAll();
}
