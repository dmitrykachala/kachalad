package ru.job4j.array;
/**
 *Class Turn - класс для переворота массива.
 *author kachala
 *since 01.05.2017
 *version 1.0
*/
public class Turn {
	/**
	*Метод, который переворачивает массив задом наперед.
	*@param array - исходный массив
	*@return - результат
	*/
	public int[] back(int[] array) {
		for (int counter = 0; counter < array.length / 2; counter++) {
			int tmp = array[counter];
			array[counter] = array[array.length - counter - 1];
			array[array.length - counter - 1] = tmp;
	}
	return array;
}
}