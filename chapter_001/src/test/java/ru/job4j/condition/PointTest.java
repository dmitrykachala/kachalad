package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
*Тестирование принадлежности точки с координатами (x, y) функции функции y(x) = a * x + b.
*/
public class PointTest {
	/**
	*Метод определяющий принадлежность.
	*/
    @Test
    public void whenPointXAndYThenRes() {
		Point pPoint = new Point(1, 5);
        boolean result = pPoint.is(2, 3);
        boolean expected = true;
        assertThat(result, is(expected));
    }
}