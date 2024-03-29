package com.example.action;

import java.util.Arrays;
import java.util.List;

import com.example.model.Student;
import com.opensymphony.xwork2.ActionSupport;

public class StudentAction extends ActionSupport {
	private Student student;
	private List<String> hobbies;
	public StudentAction() {
		hobbies=Arrays.asList("sports","music","dance");
	}
		 
	 
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public List<String> getHobbies() {
		return hobbies;
	}
	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}
	 public String showStudForm() {
		return "none";
		
			
}
	 public String execute() {
		 if(student.getName().equals("Arya"))
			 return "success";
		 return "error";
	 }

	 }
