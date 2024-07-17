package com.SpringMVC.MvcCrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringMVC.MvcCrud.model.Student;
import com.SpringMVC.MvcCrud.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentServiceI {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student saveStudent(Student stu) {
		Student save = studentRepository.save(stu);
		return save;
	}

	@Override
	public List<Student> getAllStudent() {
		List<Student> all = (List<Student>) studentRepository.findAll();//TypeCasting
		return all;
	}

	@Override
	public boolean deleteAllStu() {
		
		List<Student> all = (List<Student>) studentRepository.findAll();
		
		if(all.isEmpty())
		{
			return false;
		}else {
		studentRepository.deleteAll();	
		return true;
	    }
	   

	}
	
}
