package ru.job4j.prof;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
*Тестирование очистки массива от дубликатов.
*/
public class ProfessionTest {
	/**
	*Тестирование метода, который удаляет дубликаты.
	*/
    @Test
    public void whenProfession() {
		Doctor test = new Doctor();
        People doctor = new People(1, "a", "b", "Ivanov");
		People patient = new People(2, "d", "e", "Petrov");
        String result = test.heal(doctor, patient);
        String expect = "Ivanov heals Petrov";
        assertThat(result, is(expect));
    }
}