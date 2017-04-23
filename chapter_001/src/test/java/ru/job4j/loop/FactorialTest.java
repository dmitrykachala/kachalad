package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
*Тестирование циклов.
*/
public class FactorialTest {
	/**
	*Тестирование метода, вычисляющего факториал.
	*/
    @Test
    public void whenNThenFactorialN1() {
		Factorial fFactor = new Factorial();
        int res = fFactor.calc(0);
        int expected = 1;
        assertThat(res, is(expected));
    }
	/**
	*Тестирование метода, вычисляющего факториал.
	*/
    @Test
    public void whenNThenFactorialN2() {
		Factorial fFactor = new Factorial();
        int res = fFactor.calc(5);
        int expected = 120;
        assertThat(res, is(expected));
    }
}