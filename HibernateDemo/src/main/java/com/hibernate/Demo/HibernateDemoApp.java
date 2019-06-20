package com.hibernate.Demo;

import java.util.ArrayList;
import java.util.Collection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.Demo.model.Student;
import com.hibernate.Demo.model.StudentHobby;
import com.hibernate.Demo.model.Subject;

public class HibernateDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("*************Tesing Many To Many Relationship****************");
		
		Collection<Subject> subjectList = new ArrayList<Subject>();
		
		Collection<Student> studentList = new ArrayList<Student>();
		
		Student student1 = new Student("Manish","IET Lucknow");
		Student student2 = new Student("Rahul","IET Lucknow");
		Student student3 = new Student("Sanoj","IET Lucknow");
		
		Subject subject1 = new Subject("Computers");
		Subject subject2 = new Subject("Algebra");
		Subject subject3 = new Subject("Stastics");
		Subject subject4 = new Subject("Physics");
		Subject subject5 = new Subject("Biology");
		Subject subject6 = new Subject("Electornics");
		
		student1.getSubjectList().add(subject1);
		student1.getSubjectList().add(subject3);
		student1.getSubjectList().add(subject4);
		
		student2.getSubjectList().add(subject1);
		student2.getSubjectList().add(subject2);
		student2.getSubjectList().add(subject5);
		
		student3.getSubjectList().add(subject6);
		student3.getSubjectList().add(subject2);
		student3.getSubjectList().add(subject5);
		
		subject1.getStudentList().add(student1);
		subject1.getStudentList().add(student2);
		
		subject2.getStudentList().add(student3);
		subject2.getStudentList().add(student2);
		
		subject3.getStudentList().add(student1);
		subject3.getStudentList().add(student3);
		
		StudentHobby hobby1 = new StudentHobby("Singing");
		StudentHobby hobby2 = new StudentHobby("Travelling");
		StudentHobby hobby3 = new StudentHobby("Riding");
		StudentHobby hobby4 = new StudentHobby("Writing");
		
		Collection<StudentHobby> studentHobbies = new ArrayList<StudentHobby>();
		studentHobbies.add(hobby4);
		studentHobbies.add(hobby3);
		studentHobbies.add(hobby2);
		studentHobbies.add(hobby1);
		
		student1.setHobbies(studentHobbies);
		
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session  = sf.openSession();
		session.beginTransaction();
		
		session.persist(student1);
		session.save(student2);
		session.save(student3);
		
		session.save(subject1);
		session.save(subject2);
		session.save(subject3);
		session.save(subject4);
		session.save(subject5);
		session.save(subject6);
		
		session.getTransaction().commit();
		session.close();
		
		

	}

}
