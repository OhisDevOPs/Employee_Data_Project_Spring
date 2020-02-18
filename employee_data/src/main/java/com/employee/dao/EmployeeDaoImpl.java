package com.employee.dao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.employee.entity.Employee;

@Repository
@Transactional
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void saveEmployee(Employee newEmployee) {
		Session currentSession = 
				sessionFactory.getCurrentSession();
		
		currentSession.save(newEmployee);

	}

	@Override
	public Employee getById(int employeeId) {
		Session currentSession =
				sessionFactory.getCurrentSession();
		
		Employee savedEmployee =
		         currentSession.get(Employee.class, employeeId);
		
		return savedEmployee;
	}

	@Override
	public Employee getByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

}
