package com.SpringMVC.MvcCrud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.SpringMVC.MvcCrud.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer>
{

}
