 package com.example.FullStackProject.configuration;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.FullStackProject.Repocitory.StudentInterface;
import com.example.FullStackProject.Services.StudentServices;
import com.example.FullStackProject.model.Student;

@Service
public class StudentImp implements StudentServices {
private StudentInterface studentInt;
	
	public StudentImp(StudentInterface studentInt) {
		super();
		this.studentInt = studentInt;
	}
	public Student saveStudent(Student stdobj) {
		return studentInt.save(stdobj);
	}
	public List<Student>readAllStudents(){
		return studentInt.findAll();
	}
	public Student fetchById(int id) throws Exception {
		Optional<Student> stdobj = studentInt.findById(id);	
		if(stdobj.isPresent()) {
			return stdobj.get();
		}
		else
		{
			throw new Exception("not found"); 
		}
	}
	public Student updatestudent(int id, Student value){
		Optional<Student> stdobj = studentInt.findById(id);	
		if(stdobj.isPresent()) {
			Student objFromDB = stdobj.get();
			objFromDB.setFirstname(value.getFirstname());
			objFromDB.setLastname(value.getLastname());
			objFromDB.setFavSub(value.getFavSub());

			studentInt.save(objFromDB);
			return objFromDB;
		}
		return new Student();
	}
	public void deleteStudent(int id) {
		Optional<Student> stdobj = studentInt.findById(id);	
		if(stdobj.isPresent()) {
			studentInt.deleteById(id);
		}

	}

}
	
		
				