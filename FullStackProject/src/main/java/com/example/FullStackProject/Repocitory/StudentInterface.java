package com.example.FullStackProject.Repocitory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.FullStackProject.model.Student;

public interface StudentInterface extends JpaRepository<Student,Integer>{

	}

