package ru.job4j.max;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
*Класс тестирования элементарного калькулятора.
*/
public class MaxTest {
	/**
	*Метод тестирующий определение максимума.
	*/
    @Test
    public void whenMaxOneAndOneThenTwo() {
		Max mMax = new Max();
        int result = mMax.max(3, 5);
        int expected = 5;
        assertThat(result, is(expected));
    }
}