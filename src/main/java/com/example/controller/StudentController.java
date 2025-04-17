package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Student;
import com.example.service.EmailService;
import com.example.service.IStudentService;

@RestController
@RequestMapping("/studentApp")
public class StudentController {

	@Autowired
	private EmailService emailService;
	@Autowired
	private IStudentService iStudentService;

    @PostMapping("/register")
	public void add(@RequestBody Student student)
	{
		iStudentService.addStudent(student);
	}
    
    @GetMapping("/students")
    public List<Student> getAllStudent()
    {
    	return iStudentService.getAll();
    }
    
    @PostMapping("/sendMail")
    public ResponseEntity<String> sendExamMail(@RequestParam String rollno) {
        Student student = iStudentService.getId(rollno);
        emailService.sendExamLink(student.getEmail(), student.getName());
        return ResponseEntity.ok("Mail sent successfully");
    }

}
