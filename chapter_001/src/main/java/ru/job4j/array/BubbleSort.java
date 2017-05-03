package ru.job4j.array;
/**
 *Class BubbleSort - класс для сортировки массива методом "пузырька".
 *author kachala
 *since 03.05.2017
 *version 1.0
*/
public class BubbleSort {
	/**
	*Метод, который сортирует массив.
	*@param array - исходный массив
	*@return - результат
	*/
	public int[] sort(int[] array) {
		for (int countOut = array.length; countOut > 1; countOut--) {
			for (int countIn = 0; countIn < countOut - 1; countIn++) {
				int tmp = array[countIn];
				if (tmp > array[countIn + 1]) {
					array[countIn] = array[countIn + 1];
					array[countIn + 1] = tmp;
				}
			}
	}
	return array;
}
}