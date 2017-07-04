package ru.job4j.prof;
/**

*/
public class Doctor extends Profession {
	/**
	*@param doctor -
	*@param patient -
	*@return -
    */
	public String heal(People doctor, People patient) {
		return doctor.getSurname() + " heals " + patient.getSurname();
	}
}