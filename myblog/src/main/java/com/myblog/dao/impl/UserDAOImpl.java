package com.myblog.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.myblog.dao.UserDAO;
import com.myblog.models.User;

@Repository
public class UserDAOImpl extends AbstractDAOImpl<User> implements UserDAO {

	public User getByEmail(String email) {
		Criteria criteria = createCriteria();
		criteria.add(Restrictions.eq("email", email));
		return (User) criteria.uniqueResult();
	}

}
