package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.demo.dao.StudentRepo;
import com.example.demo.model.Student;

@Service
public class StudentService {
	@Autowired
	private StudentRepo repo;
	
	public Student createStudent(Student student) {
		return repo.save(student);
	}
	
	public Iterable<Student> getAllStudents(Integer pageNo){
		Iterable<Student> list =repo.findAll( PageRequest.of(pageNo, 2));
		return list;
		
	}
	
	public void deleteStudent(Integer phoneNumber) {
		repo.deleteById(phoneNumber);
	}
	
	public Student updateStudent(Integer phoneNumber, String sEmail) {
		Student student =  repo.findById(phoneNumber).orElse(new Student());
		student.setsEmail(sEmail);
		return repo.save(student);
	}
	 
	public Optional<Student> getStudent(Integer phoneNumber){
		Optional<Student> list = repo.findById(phoneNumber);
		return list;
	}
	

}
