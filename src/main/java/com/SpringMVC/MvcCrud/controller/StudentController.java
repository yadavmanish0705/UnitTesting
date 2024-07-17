package com.SpringMVC.MvcCrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.SpringMVC.MvcCrud.model.Student;
import com.SpringMVC.MvcCrud.service.StudentServiceI;

@Controller
public class StudentController {

	@Autowired
	private StudentServiceI studentServiceI;
	
	@GetMapping("/welcomeForm")
	public ModelAndView form() {

		ModelAndView mav = new ModelAndView();

		mav.setViewName("welcome1");
		return mav;

	}

	/* Create a Table */
	@GetMapping("/saveStudent")
	public ModelAndView saveStu(Student stu) {

		Student student = studentServiceI.saveStudent(stu);

		ModelAndView mav = new ModelAndView();
		mav.addObject("STU", student);
		mav.setViewName("student");
		return mav;

	}
	
	/* Get All Students */
	@GetMapping("/getAllStu")
	public ModelAndView getAllStu()
	{
		List<Student> allStudent = studentServiceI.getAllStudent();
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("STUS", allStudent);
		mav.setViewName("students");
		return mav;	
	}
	
	/* Delete All Students */
	@GetMapping("/deleteAllStu")
	public ModelAndView deleteAllStu()
	{
		boolean deleteAllStu1 = studentServiceI.deleteAllStu();
		if(deleteAllStu1)
		{
			String msg= "Record Deleted Sucessfully";
			ModelAndView mav = new ModelAndView();
			mav.addObject("MSG", msg);
			mav.setViewName("deleteSucc");
			
			return mav;
		}else {
		
			String msg= "Record Not Deleted ";
		ModelAndView mav = new ModelAndView();
		mav.addObject("MSG1", msg);
		mav.setViewName("deletefail");
		
		return mav;
	}			
	}
}

