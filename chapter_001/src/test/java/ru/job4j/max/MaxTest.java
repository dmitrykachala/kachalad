package ru.job4j.max;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
*Класс тестирования нахождения максимума.
*/
public class MaxTest {
	/**
	*Метод тестирующий определение максимума.
	*/
    @Test
    public void whenMaxOneAndOneThenTwo() {
		Max mMax = new Max();
        int result = mMax.max3(334, 333, 400);
        int expected = 400;
        assertThat(result, is(expected));
    }
}