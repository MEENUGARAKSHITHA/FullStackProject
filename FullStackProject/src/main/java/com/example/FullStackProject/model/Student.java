package com.example.FullStackProject.model;
import jakarta.persistence.*;
	@Entity
	@Table(name="studentTable")
	public class Student {
		@Id//primary key
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "id")
		private int rollNum;
		@Column
		private String firstname;
		@Column
		private String lastname;
		@Column
		private String favSub;
		
		public String getFirstname() {
			return firstname;
		}
		public String getLastname() {
			return lastname;
		}
		public String getFavSub() {
			return favSub;
		}
		public int getRollNum() {
			return rollNum;
		}
		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}
		public void setLastname(String lastname) {
			this.lastname = lastname;
		}
		public void setFavSub(String favSub) {
			this.favSub = favSub;
		}
		public void setRollNum(int rollNum) {
			this.rollNum = rollNum;
		}
	}

