package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Student;
import com.example.exception.IdNotFoundException;
import com.example.repository.StudentRepository;

@Service
public class StudentServiceImpl implements IStudentService{
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void addStudent(Student student) {
		studentRepository.save(student);
		
	}
	
	@Override
	public Student getId(String rollno) {
		Optional<Student> opt=studentRepository.findById(rollno);
		if(opt.isPresent())
		{
			return opt.get();
		}
		throw new IdNotFoundException("Student with Id not found");
	}
	
	@Override
	public List<Student> getAll() {
		return studentRepository.findAll();
		
	}

	@Override
	public void updateStudent(Student student) {
		Optional<Student> exist=studentRepository.findById(student.getRollno());
		
		if(exist.isPresent())
		{
			Student update=exist.get();
			update.setName(student.getName());
			update.setEmail(student.getEmail());
			update.setMobileno(student.getMobileno());
			studentRepository.save(update);
		}
		else
		{
			throw new IdNotFoundException("Student with Id not found");
		}
	
		
	}

	@Override
	public void deleteStudent(String rollno) {
		studentRepository.deleteById(rollno);
		
	}

}
