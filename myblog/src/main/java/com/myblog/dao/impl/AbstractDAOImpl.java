package com.myblog.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.myblog.dao.AbstractDAO;

@Repository
public abstract class AbstractDAOImpl<T> implements AbstractDAO<T>  {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void save(T object) {
		getSession().save(object);
	}
	
	public void delete(T object) {
		getSession().delete(object);
	}
	
	public void update(T object) {
		getSession().delete(object);
	}
	
	@SuppressWarnings("unchecked")
	public T get(Long id) {
		return (T) getSession().get(getObjectClass(), id);
	}
	
	@SuppressWarnings("unchecked")
	public List<T> getAll() {
		return createCriteria().list();
	}

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@SuppressWarnings({"unchecked" })
	private  Class<T> getObjectClass() {
		final Type actualArgumentType = ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];

		if (actualArgumentType instanceof ParameterizedType) {
			return (Class<T>) ((ParameterizedType) actualArgumentType).getRawType();
		}
		return (Class<T>) actualArgumentType;
	}
	
	protected Criteria createCriteria() {
		return getSession().createCriteria(getObjectClass());
	}

}
