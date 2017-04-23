package ru.job4j.loop;
/**
 *Class Factorial - для вычисления.
 *author kachala
 *since 23.04.2017
 *version 1.0
*/
public class Factorial {
	/**
	*Метод вычисляющий факториал.
	*@param n - аргумент
	*@return - результат
	*/
   public  int calc(int n) {
      int result = 1;
	  if (n == 0) {
		  return result;
	  } else {
			for (int index = 1; index <= n; index++) {
			result *= index;
			}
	  return result;
	  }
  }
}