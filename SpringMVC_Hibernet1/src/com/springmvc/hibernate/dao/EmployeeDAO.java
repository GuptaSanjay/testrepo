package com.springmvc.hibernate.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springmvc.hibernate.employeebeans.Employee;
import com.springmvc.hibernate.entity.EmployeeEntity;

@Repository("employeedao")
public class EmployeeDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	public void saveEmployee(EmployeeEntity employeeEntity) {
		// TODO Auto-generated method stub
		Session session=null;
		System.out.println(employeeEntity.getId());
		sessionFactory.getCurrentSession().saveOrUpdate(employeeEntity);
		
	}

	public List<Employee> viewEmployees() {
		// TODO Auto-generated method stub
		//sessionFactory.getCurrentSession().createQuery("from EmployeeEntity").list();
		Session session = null;
		
		try {
		    session = sessionFactory.getCurrentSession();
		} catch (HibernateException e) {
		    session = sessionFactory.openSession();
		}
		
		Query query = session.createQuery("from EmployeeEntity");
		List<Employee> list = query.list();
		return list;
		
	}

public void deleteEmployee(Integer id) {
		
		System.out.println("in DAO: for deleting:  " + id );
		// TODO Auto-generated method stub
		Session session = null;
		
		try {
		    session = sessionFactory.getCurrentSession();
		} catch (HibernateException e) {
		    session = sessionFactory.openSession();
		}
		
		EmployeeEntity employee  = (EmployeeEntity) session.get(EmployeeEntity.class, id);
		if(employee!=null) {
			session.delete(employee);
		}else {
			System.out.println("Employee with id " + id + " not found");
		}
		
		session.flush();
	
	}

public EmployeeEntity updateEmployee(Integer id) {
	// TODO Auto-generated method stub
	System.out.println("in DAO: for update of :  " + id );
	// TODO Auto-generated method stub
	Session session = null;
	try {
	    session = sessionFactory.getCurrentSession();
	} catch (HibernateException e) {
	    session = sessionFactory.openSession();
	}
	EmployeeEntity employeeEntity  = (EmployeeEntity) session.get(EmployeeEntity.class, id);
	if(employeeEntity!=null) {
		System.out.println("can be updated");
	}else {
		System.out.println("Employee with id " + id + " not able to update!!!");
	}
	session.update(employeeEntity);
	return employeeEntity;
	
}

}
