package com.learning.mvc.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;

import org.springframework.stereotype.Repository;

import com.learning.mvc.model.User;

/**
 * 
 * @author santoshkumarkar
 *
 */
@Repository
public class UserDaoImpl implements UserDao {

	@PersistenceContext
	private EntityManager em;

	@Override
	public List<User> findAll() {
		CriteriaQuery<User> criteriaQuery = 
				em.getCriteriaBuilder().createQuery(User.class);
		return em.createQuery(criteriaQuery).getResultList();
	}
	
	@Override
	public User findById(int id) {
		return em.find(User.class, id);
	}

	@Override
	public User findByUserName(String userName) {
		Query query = em.createNamedQuery("findByUsername");
		query.setParameter("username", userName);
		User user = (User) query.getSingleResult();
		System.out.println(user);
		
		return user;
	}

//	@Override
//	public Set<Role> findRolesByUserId(int userId) {
//		User user = em.find(User.class, userId);
//		Set<Role> roles = user.getRoles();
//		System.out.println(roles);
//		return roles;
//	}

	
}