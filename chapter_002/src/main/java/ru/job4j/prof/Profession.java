package ru.job4j.prof;
/**

*/
public class Profession {
	/**

    */
	private int birthDate;
	/**

    */
	private boolean maritalSatus;
	/**

    */
	private String children;
	/**

    */
	private String diploma;
	/**

    */
	private String academicDegree;
	/**

    */
	private int experience;
	/**

    */
	/**

    */
	public Profession() {
	}
	/**
	*@param birthDate -
	*@param maritalSatus -
	*@param children -
	*@param diploma -
	*@param academicDegree -
	*@param experience -
	*/
	public Profession(int birthDate, boolean maritalSatus, String children, String diploma, String academicDegree, int experience) {
		this.birthDate = birthDate;
		this.maritalSatus = maritalSatus;
		this.children = children;
		this.diploma = diploma;
		this.academicDegree = academicDegree;
		this.experience = experience;
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
	public boolean getMaritalStatus() {
		return this.maritalSatus;
	}
	/**
	*@return -
	*/
	public String getChildren() {
		return this.children;
	}
	/**
	*@return -
	*/
	public String getDiploma() {
		return this.diploma;
	}
	/**
	*@return -
	*/
	public String getAcademicDegree() {
		return this.academicDegree;
	}
	/**
	*@return -
	*/
	public int getExperience() {
		return this.experience;
	}
}