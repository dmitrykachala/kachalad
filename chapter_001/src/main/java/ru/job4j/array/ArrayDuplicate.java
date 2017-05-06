package ru.job4j.array;

import java.util.Arrays;
/**
 *Class ArrayDuplicate - класс для удаления дубликатов в массиве.
 *author kachala
 *since 06.05.2017
 *version 1.0
*/
public class ArrayDuplicate {
	/**
	*Метод, который удаляет дубликаты.
	*@param array - исходный массив
	*@return - результат
	*/
	public String[] remove(String[] array) {
		int copy = 0;
		for (int countOut = 0; countOut < array.length - 1; countOut++) {
			for (int countIn = countOut + 1; countIn < array.length - 1; countIn++) {
				String tmpOut = array[countOut];
				String tmpIn = array[countIn];
				if (tmpOut == tmpIn) {
					array[countIn] = array[countIn + 1];
					array[countIn + 1] = tmpIn;
					//copy += 1;
				}
			}
	}
	return Arrays.copyOf(array, array.length - copy);
}
}