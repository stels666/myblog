package com.myblog.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.myblog.dao.AbstractDAO;
import com.myblog.services.AbstractService;

@Service
@Transactional(readOnly=true)
public abstract class AbstractServiceImpl<T> implements AbstractService<T> {

	public abstract AbstractDAO<T> getDAO();
	
	@Transactional(readOnly=false)
	public void save(T object) {
		getDAO().save(object);
	}
	
	@Transactional(readOnly=false)
	public void delete(T object) {
		getDAO().delete(object);
	}
	
	@Transactional(readOnly=false)
	public void update(T object) {
		getDAO().update(object);
	}
	
	public T get(Long id) {
		return getDAO().get(id);
	}
	
	public List<T> getAll() {
		return getDAO().getAll();
	}

}
