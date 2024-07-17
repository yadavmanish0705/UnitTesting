package com.SpringMVC.MvcCrud.service;

import java.util.List;

import com.SpringMVC.MvcCrud.model.Student;

public interface StudentServiceI {

	public Student saveStudent(Student stu);
	
	public List<Student> getAllStudent();
	
	public boolean deleteAllStu();
}
