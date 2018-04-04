package sampleBoot.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import sampleBoot.Model.Task;

@Repository
public class TaskDAO {
	
	@Autowired
	private SessionFactory sf;
	
	public List<Task> getAll() {
		// TODO Auto-generated method stub
		//sessionFactory.getCurrentSession().createQuery("from EmployeeEntity").list();
		Session session = null;
		
		try {
		    session = sf.getCurrentSession();
		} catch (HibernateException e) {
		    session = sf.openSession();
		}
		
		Query query = session.createQuery("from task_manager");
		List<Task> task = query.list();
		return task;
}
}
