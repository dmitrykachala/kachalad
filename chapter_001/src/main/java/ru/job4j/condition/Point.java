package ru.job4j.condition;
/**
 *Class Point описывает точку в системе координат.
 *author kachala
 *since 19.04.2017
 *version 1.0
*/
public class Point {
   /**
	*переменная для координаты x.
	*/
   private int x;
   /**
	*переменная для координаты y.
	*/
   private int y;
	/**
	*Метод описывающий точку с координатами x, y.
	*@param x - координата x
	*@param y - координата y
	*/
   public  Point(int x, int y) {
      this.x = x;
      this.y = y;
  }
	/**
	*Метод возвращающий значение координаты x.
	*@return - результат работы метода
	*/
  public int getX() {
      return this.x;
  }
	/**
	*Метод возвращающий значение координаты y.
	*@return - результат работы метода
	*/
  public int getY() {
     return this.y;
  }
	/**
	*Метод определяющий принадлежность точки с координатами (x, y) функции y(x) = a * x + b.
	*@param a - коофициент a
	*@param b - смещение b
	*@return - результат работы метода
	*/
  public boolean is(int a, int b) {
	Point pPoint = new Point(1, 5);
    return (pPoint.getY() == a * pPoint.getX() + b) ? true : false;
}
}