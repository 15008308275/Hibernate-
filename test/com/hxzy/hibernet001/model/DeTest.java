package com.hxzy.hibernet001.model;

import static org.junit.Assert.*;

import java.util.HashSet;

import org.hibernate.Session;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.hxzy.hibernet001.utils.HibernateUtil;

public class DeTest {
	Session session;
	@Before
	public void setUp() throws Exception {
		session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
	}

	@After
	public void tearDown() throws Exception {
		session.getTransaction().commit();
	}

	@Test
	public void test() {
		Employee zhang = new Employee("张三", 2001, 21);
		Employee li = new Employee("李四", 2002, 23);
		session.save(zhang); 
		session.save(li);
		
		HashSet<Employee> employees = new HashSet<Employee>();
		employees.add(zhang);
		employees.add(li);
		
		Department department = new Department("技术部", 1002, "技术难题", employees);
		
		session.save(department);
	}

}
