package com.app.common.persistance;

import java.util.List;

import javax.annotation.PostConstruct;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.app.common.value.objects.User;

@Repository("userDao")
public class UserDaoImpl extends HibernateDaoSupport {

	@Autowired
	private SessionFactory sessionFactory;

	@Transactional(readOnly = false)
	public void save(User user) {
		getHibernateTemplate().save(user);
	}

	public void update(User user) {
		getHibernateTemplate().update(user);
	}

	public void delete(User user) {
		getHibernateTemplate().delete(user);
	}

	public User findByStockCode(String email) {
		@SuppressWarnings("unchecked")
		List<User> list = (List<User>) getHibernateTemplate().find("from User where email=?", email);
		return list.get(0);
	}

	@PostConstruct
	public void init() {
		setSessionFactory(sessionFactory);
	}
}
