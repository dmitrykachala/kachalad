package ru.job4j.loop;
/**
 *Class Board - для рисования шахматной доски.
 *author kachala
 *since 27.04.2017
 *version 1.0
*/
public class Board {
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
		for (int count = 1; count <= width; count++) {
			if (count % 2 == 1) {
				buffer.append("X");
			} else {
				buffer.append(" ");
			}
		}
		} else {
			for (int count = 1; count <= width; count++) {
			if (count % 2 == 0) {
				buffer.append("X");
			} else {
				buffer.append(" ");
			}
		}
		}
		if (strNumber != height) {
			buffer.append(System.getProperty("line.separator"));
		}
  }
  return buffer.toString();
}
}