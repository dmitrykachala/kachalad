package ru.job4j.loop;
/**
 *Class Counter - для работы с циклами.
 *author kachala
 *since 22.04.2017
 *version 1.0
*/
public class Counter {
	/**
	*Метод считающий сумму чётных чисел в диапазоне от start до finish.
	*@param start - начальное число
	*@param finish - конечное число
	*@return - результат
	*/
   public  int add(int start, int finish) {
      int result = 0;
	  for (int index = start; index < finish + 1; index++) {
		if (index % 2 == 0) {
			result = result + index;
		}
	  }
	  return result;
  }
}