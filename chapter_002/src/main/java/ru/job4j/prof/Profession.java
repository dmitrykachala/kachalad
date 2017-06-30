package ru.job4j.prof;

public class Profession {
	public int birthDate;
	public boolean maritalSatus;
	public String children;
	public String diploma;
	public String academicDegree;
	public int experience;
	public Profession() {
		
	}
	public Profession(int birthDate, boolean maritalSatus, String children, String diploma, String academicDegree, int experience) {
		this.birthDate = birthDate;
		this.maritalSatus = maritalSatus;
		this.children = children;
		this.diploma = diploma;
		this.academicDegree = academicDegree;
		this.experience = experience;
	}
	public int getBirthDate() {
		return this.birthDate;
	}
	public boolean getMaritalStatus() {
		return this.maritalSatus;
	}
	public String getChildren() {
		return this.children;
	}
	public String getDiploma() {
		return this.diploma;
	}
	public String getAcademicDegree() {
		return this.academicDegree;
	}
	public int getExperience() {
		return this.experience;
	}
} 