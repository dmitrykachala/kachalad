package ru.job4j.max;
/**
 *Class Max поиск максимума из двух целых чисел.
 *author kachala
 *since 18.04.2017
 *version 1.0
*/
public class Max {
	/**
	*Максимум.
	*/
	private int maximum;
	/**
	*Метод определяющий максимум.
	*@param first - первое целое число
	*@param second - второе целое число
	*@return - результат работы метода
	*/
	public int max(int first, int second) {
		maximum = first > second ? first : second;
		return maximum;
	}
}