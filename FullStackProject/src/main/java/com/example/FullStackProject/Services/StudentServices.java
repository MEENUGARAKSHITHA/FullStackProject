package com.example.FullStackProject.Services;

import java.util.List;

import com.example.FullStackProject.model.Student;

public interface StudentServices {
	Student saveStudent(Student stdobj);
	List<Student>readAllStudents();
	Student fetchById(int studentId) throws Exception ;
	Student updatestudent(int id,Student value);
	void deleteStudent(int id);

}


