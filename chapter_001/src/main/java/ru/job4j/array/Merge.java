package ru.job4j.array;

//import java.util.Arrays;
/**
 *Class Merge - класс для получения отсортированного массива из двух массивов.
 *author kachala
 *since 06.06.2017
 *version 1.0
*/
public class Merge {
	/**
	*Метод, который осуществляет слияние двух отсортированных массивов в треттий, тоже отсортированный.
	*@param arrayA - первый массив
	*@param arrayB - второй массив
	*@return - результат
	*/
	public int[] merge(int[] arrayA, int[] arrayB) {
		int i = 0;
		int j = 0;
		int k = 0;
		int[] arrayRes = new int[arrayA.length + arrayB.length];
		while ((i < arrayA.length) || (j < arrayB.length)) {
			if (j >= arrayB.length && i < arrayA.length) {
				arrayRes[k] = arrayA[i];
				i++;
			} else if (i >= arrayA.length && j < arrayB.length) {
				arrayRes[k] = arrayB[j];
				j++;
			} else if (arrayA[i] >= arrayB[j]) {
				arrayRes[k] = arrayB[j];
				j++;
			} else if (arrayA[i] < arrayB[j]) {
				arrayRes[k] = arrayA[i];
				i++;
			}
			k++;
		}
	return arrayRes;
}
}