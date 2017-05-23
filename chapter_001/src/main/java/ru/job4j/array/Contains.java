package ru.job4j.array;

import java.util.Arrays;
/**
 *Class Contains - класс для определения содержится ли заданная подстрока в указанной строке.
 *author kachala
 *since 21.05.2017
 *version 1.0
*/
public class Contains {
	/**
	*Метод, который определяет содержится ли заданная подстрока в указанной строке.
	*@param origin - исходная строка
	*@param sub - подстрока
	*@return - результат
	*/
	public char[] intoArray (String input) {
		char[] arr = new char[input.length()];
		for (int i = 0; i < input.length(); i++) {
			arr[i] = input.charAt(i);
		}
		return arr;
	}
	/**
	*Метод, который определяет содержится ли заданная подстрока в указанной строке.
	*@param origin - исходная строка
	*@param sub - подстрока
	*@return - результат
	*/
	public boolean contains(String origin, String sub) {
		char[] originArr = Contains.intoArray(origin);
		char[] subArr = Contains.intoArray(sub);
		if(subArr.length == 0) return true;
		if(originArr.length == 0) return false;
		if(subArr.length <= originArr.length) {
				for (int j = 0; j <= originArr.length - subArr.length; j++){
					if(originArr[j].equals(subArr[0])){
						char[] tmpArr = Arrays.copyOfRange(originArr, j, originArr.length - 1);
						int signal = 1;
						for (int k = 1; k < subArr.length; k++) {
							if(tmpArr[k].equals(subArr[k])) {
								signal += 1;
							}
						}
						if(signal == subArr.length)
							return true;
					}
				}		
		}
			return false;
}
}