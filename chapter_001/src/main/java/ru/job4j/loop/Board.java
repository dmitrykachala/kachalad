package ru.job4j.loop;
/**
 *Class Board - для рисования шахматной доски.
 *author kachala
 *since 27.04.2017
 *version 1.0
*/
public class Board {
	/**
	*Метод, который заполняет строку.
	*@param a - первый сивол для замены
	*@param b - второй сивол для замены
	*@param length - длина строки
	*@return - результат
	*/
	public String fillRow(char a, char b, int length) {
		StringBuilder buffer1 = new StringBuilder();
		for (int counter = 1; counter <= length; counter++) {
			if (counter % 2 == 1) {
				buffer1.append(a);
			} else {
				buffer1.append(b);
			}
		}
		return buffer1.toString();
	}
	/**
	*Метод, который отрисовывает доску.
	*@param width - ширина доски
	*@param height - высота доски
	*@return - результат
	*/
   public String paint(int width, int height) {
	StringBuilder buffer = new StringBuilder();
	for (int strNumber = 1; strNumber <= height; strNumber++) {
		if (strNumber % 2 == 1) {
		buffer.append(fillRow('X', ' ', width));
			} else {
		buffer.append(fillRow(' ', 'X', width));
			}
		if (strNumber != height) {
			buffer.append(System.getProperty("line.separator"));
		}
  }
  return buffer.toString();
}
}