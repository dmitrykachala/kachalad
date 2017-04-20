package ru.job4j.condition;
/**
 *Class Triangle описывает треугольник с вершинами в точках a, b, c.
 *author kachala
 *since 20.04.2017
 *version 1.0
*/
public class Triangle {
/**
*координаты a.
*/
private Point a;
/**
*координаты b.
*/
private Point b;
/**
*координаты c.
*/
private Point c;
	/**
	*Метод описывающий координаты вершин треугольника.
	*@param a - координаты вершины a
	*@param b - координаты вершины b
	*@param c - координаты вершины c
	*/
public Triangle(Point a, Point b, Point c) {
this.a = a;
this.b = b;
this.c = c;
}
	/**
	*Метод вычисляющий площадь треугольника с заданными вершинами.
	*@return - возвращает площадь треугольника
	*/
public double area() {
//calculate the triangle area
//return ((c.getX() - a.getX()) / (b.getX() - a.getX()) == (c.getY() - a.getY()) / (b.getY() - a.getY())) ? (0.0) : (0.5*((a.getX() - c.getX()) * (b.getY() - c.getY()) - (b.getX() - c.getX()) * (a.getY() - c.getY())));
if ((c.getX() - a.getX()) / (b.getX() - a.getX()) == (c.getY() - a.getY()) / (b.getY() - a.getY())) {
	return 0.0;
} else {
	return Math.abs(0.5 * ((a.getX() - c.getX()) * (b.getY() - c.getY()) - (b.getX() - c.getX()) * (a.getY() - c.getY())));
	}
}
}