package ru.job4j.loop;
/**
 *Class Paint - для рисования пирамиды.
 *author kachala
 *since 25.04.2017
 *version 1.0
*/
public class Paint {
	/**
	*Метод, который отрисовывает пирамиду.
	*@param h - высота пирамиды
	*@return - результат
	*/
   public String piramid(int h) {
	StringBuilder buffer = new StringBuilder();
	int width = 2 * h - 1;
	for (int strNumber = 1; strNumber <= h; strNumber++) {
		int space = h - strNumber;
		int galka = 2 * strNumber - 1;
		for (int count = 1; count <= width + 1; count++) {
			if ((count <= space) || ((count > space + galka) && (count < width + 1))) {
				buffer = buffer.append(" ");
			} else if (count <= space + galka) {
				buffer = buffer.append("^");
			}
		}
		if (strNumber != h) {
			buffer = buffer.append(System.getProperty("line.separator"));
		}
  }
  return buffer.toString();
}
}