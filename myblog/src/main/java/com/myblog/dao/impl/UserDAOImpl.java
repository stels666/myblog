package com.myblog.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.myblog.dao.UserDAO;
import com.myblog.models.User;

@Repository
public class UserDAOImpl extends AbstractDAOImpl<User> implements UserDAO {

	public User getByLoginOrEmail(String loginOrEmail) {
		Criteria criteria = createCriteria();
		criteria.add(Restrictions.or(Restrictions.eq("login", loginOrEmail), Restrictions.eq("email", loginOrEmail)));
		return (User) criteria.uniqueResult();
	}

}
