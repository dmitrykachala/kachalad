package ru.job4j.prof;
/**

*/
public class People {
	/**

	*/
	private int birthDate;
	/**

	*/
	private String name;
	/**

	*/
	private String secondName;
	/**

	*/
	private String surname;
	/**

	*/
	public People() {
	}
	/**
	*@param birthDate -
	*@param name -
	*@param secondName -
	*@param surname -
	*/
	public People(int birthDate, String name, String secondName, String surname) {
		this.birthDate = birthDate;
		this.name = name;
		this.secondName = secondName;
		this.surname = surname;
	}
	/**
	*@return -
	*/
	public int getBirthDate() {
		return this.birthDate;
	}
	/**
	*@return -
	*/
	public String getName() {
		return this.name;
	}
	/**
	*@return -
	*/
	public String getSecondName() {
		return this.secondName;
	}
	/**
	*@return -
	*/
	public String getSurname() {
		return this.surname;
	}
}