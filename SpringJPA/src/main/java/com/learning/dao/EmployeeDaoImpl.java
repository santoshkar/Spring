package com.learning.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.learning.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@PersistenceContext
	public EntityManager entityManager;
	
	@Transactional
	public void add(Employee employee) {
		// Create new employee
		entityManager.persist(employee);
		
	}
	
	
	@Transactional
	public void delete(Employee employee) {
		// Remove the entity
		entityManager.remove(employee);
		
	}

	public Employee findById(Long id) {
		return entityManager.find(Employee.class, id);
	}

	public List<Employee> findAll() {
		
		CriteriaQuery<Employee> criteriaQuery = 
				entityManager.getCriteriaBuilder().createQuery(Employee.class);
		
		return entityManager.createQuery(criteriaQuery).getResultList();
	}


	public List<Employee> findByName(String name) {
		Query query = entityManager.createQuery("FROM Employee e WHERE e.name = ?1");
		// Query query = entityManager.createNamedQuery("FROM Employee e WHERE e.name = :name");
		query.setParameter(1, "Sudhakar");
		List<Employee> list = query.getResultList();
		return list;
	}

}







