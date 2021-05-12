package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.StudentRepo;
import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentRepo;
	
	@PostMapping("/createStudent")
	public Student create(Student student) {
		
		return studentRepo.createStudent(student);
	}
	
	@GetMapping("/getAllStudents")
	public Iterable<Student> getAllStudents(@RequestParam("pageNo") Integer pageNo ){
		
		return studentRepo.getAllStudents(pageNo);
	}
	
	@GetMapping("/getStudent/{phoneNumber}")
	public Optional<Student> getStudent(@PathVariable("phoneNumber") Integer phoneNumber ){
		
		return studentRepo.getStudent(phoneNumber);
	}
	
	@PutMapping("/getStudent/{phoneNumber}/{sEmail}")
	public Student updateStudent(@PathVariable("phoneNumber") Integer phoneNumber,
			                                @PathVariable("sEmail") String sEmail ){
	
		return studentRepo.updateStudent(phoneNumber, sEmail);
	}
	
	@DeleteMapping("/getStudent/{phoneNumber}")
	public void deleteStudent(@PathVariable("phoneNumber") Integer phoneNumber) {
		studentRepo.deleteStudent(phoneNumber);
	}
	

}
