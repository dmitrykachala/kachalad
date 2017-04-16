package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
*Класс тестирования элементарного калькулятора.
*/
public class CalculatorTest {
	/**
	*Метод тестирующий сложение.
	*/
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(-14.0, 7.0);
        double result = calc.getResult();
        double expected = -7.0;
        assertThat(result, is(expected));
    }
	/**
	*Метод тестирующий вычитание.
	*/
	@Test
	public void whenSubOneMinusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.subtract(-14.0, 7.0);
        double result = calc.getResult();
        double expected = -21.0;
        assertThat(result, is(expected));
    }
	/**
	*Метод тестирующий умножение.
	*/
	@Test
	public void whenMultiplyOneMultiOneThenTwo() {
        Calculator calc = new Calculator();
        calc.multiply(-14.0, 7.0);
        double result = calc.getResult();
        double expected = -98.0;
        assertThat(result, is(expected));
    }
	/**
	*Метод тестирующий деление.
	*/
	@Test
	public void whenDivideOneDivOneThenTwo() {
        Calculator calc = new Calculator();
        calc.divide(-14.0, 7.0);
        double result = calc.getResult();
        double expected = -2.0;
        assertThat(result, is(expected));
    }
}