package com.myblog.dao;

import java.util.List;

import org.hibernate.Session;

public interface AbstractDAO<T> {
	
	public void save(T object);
	
	public void delete(T object);
	
	public void update(T object);
	
	public T get(Long id);
	
	public List<T> getAll();
	
	public Session getSession();

}
