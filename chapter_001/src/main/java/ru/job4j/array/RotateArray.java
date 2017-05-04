package ru.job4j.array;
/**
 *Class RotateArray - класс для поворота двумерного массива.
 *author kachala
 *since 04.05.2017
 *version 1.0
*/
public class RotateArray {
	/**
	*Метод, который поворачивает двумерный массив по часовой стрелке на 90 градусов.
	*@param array - исходный массив
	*@return - результат
	*/
	public int[][] rotate(int[][] array) {
		int[][] arrayRes = new int[array[0].length][array.length];
		for (int countOut = 0; countOut < array.length; countOut++) {
			for (int countIn = 0; countIn < array[0].length; countIn++) {
				arrayRes[countOut][countIn] = array[array.length - 1 - countIn][countOut];
			}
	}
	return arrayRes;
}
}