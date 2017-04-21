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
	*Метод определяющий максимум из двух чисел.
	*@param first - первое целое число
	*@param second - второе целое число
	*@return - результат работы метода
	*/
	public int max(int first, int second) {
		maximum = first > second ? first : second;
		return maximum;
	}
	/**
	*Метод определяющий максимумиз трех чисел.
	*@param first - первое целое число
	*@param second - второе целое число
	*@param third - третье целое число
	*@return - результат работы метода
	*/
	public int max3(int first, int second, int third) {
		//maximum = first > second ? first : second;
		return max(max(first, second), third);
	}
}