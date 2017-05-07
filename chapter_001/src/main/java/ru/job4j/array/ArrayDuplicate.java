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
	for (int countOut = 0; countOut < array.length - 1 - copy; countOut++) {
			for (int countIn = array.length - 1 - copy; countIn > countOut; countIn--) {
				String tmp = array[array.length - 1 - copy];
				if (array[countOut].equals(array[countIn])) {
					for (int i = countIn; i < array.length - 1 - copy; i++) {
					String itmp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = itmp;
					}
					copy += 1;
				}
			}
	}
	return Arrays.copyOf(array, array.length - copy);
}
}