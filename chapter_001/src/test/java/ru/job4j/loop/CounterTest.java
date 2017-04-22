package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
*Тестирование циклов.
*/
public class CounterTest {
	/**
	*Тестирование метода, суммирующего чётные числа в заданном диапазоне.
	*/
    @Test
    public void whenStartAndFinishRes() {
		Counter cCount = new Counter();
        int res = cCount.add(1, 12);
        int expected = 42;
        assertThat(res, is(expected));
    }
}