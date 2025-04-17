package com.example.service;

import java.util.List;

import com.example.entity.Student;
import com.example.exception.IdNotFoundException;

public interface IStudentService {
	
	public void addStudent(Student student);
	public void updateStudent(Student student) throws IdNotFoundException;
	public void deleteStudent(String rollno);
	public List<Student> getAll() throws IdNotFoundException;
	public Student getId(String rollno);

}
