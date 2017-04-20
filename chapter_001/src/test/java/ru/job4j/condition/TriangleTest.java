package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.hamcrest.number.IsCloseTo.closeTo;
/**
*Тестирование функции, вычисляющей плозадь треугольника по заданным координатам его вершины.
*/
public class TriangleTest {
	/**
	*Метод вычисляющий площадь.
	*/
    @Test
    public void whenPointXAndYThenRes() {
		Point a = new Point(1, 1);
		Point b = new Point(2, 4);
		Point c = new Point(6, 3);
		Triangle tri = new Triangle(a, b, c);
        double result = tri.area();
        double expected = 6.5;
        assertThat(result, is(closeTo(expected, 0.01)));
    }
}