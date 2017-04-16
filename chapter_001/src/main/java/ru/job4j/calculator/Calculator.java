package ru.job4j.calculator;
/**
 *Class Calculator решение задачи 185.
 *author kachala
 *since 16.04.2017
 *version 1.0
*/
public class Calculator {
	/**
	*Элементарный калькулятор.
	*/
    private double result;
	/**
	*Метод реализующий сложение.
	*@param first - первое слагаемое
	*@param second - второе слагаемое
	*/
    public void add(double first, double second) {
        this.result = first + second;
    }
	/**
	*Метод реализующий вычитание.
	*@param first - уменьшаемое
	*@param second - вычитаемое
	*/
	public void subtract(double first, double second) {
        this.result = first - second;
    }
	/**
	*Метод реализующий умножение.
	*@param first - первый множитель
	*@param second - второй множитель
	*/
	public void multiply(double first, double second) {
        this.result = first * second;
    }
	/**
	*Метод реализующий деление.
	*@param first - делимое
	*@param second - делитель
	*/
	public void divide(double first, double second) {
        this.result = first / second;
    }
	/**
	*Метод получающий результат.
	*@return - возвращает результат
	*/
    public double getResult() {
        return this.result;
    }
}