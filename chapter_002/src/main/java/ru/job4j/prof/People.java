package ru.job4j.prof;

public class People {
	public int birthDate;
	public String name;
	public String secondName;
	public String surname;
	
	public People() {
		
	}
	public People(int birthDate, String name, String secondName, String surname) {
		this.birthDate = birthDate;
		this.name = name;
		this.secondName = secondName;
		this.surname = surname;
	}
	public int getBirthDate() {
		return this.birthDate;
	}
	public String getName() {
		return this.name;
	}
	public String getSecondName() {
		return this.secondName;
	}
	public String getSurname() {
		return this.surname;
	}
}