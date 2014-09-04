package com.myblog.services;

import java.util.List;

public interface AbstractService<T> {
	
public void save(T object);
	
	public void delete(T object);
	
	public void update(T object);
	
	public T get(Long id);
	
	public List<T> getAll();

}
