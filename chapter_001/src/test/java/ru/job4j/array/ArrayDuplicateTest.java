package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
*Тестирование очистки массива от дубликатов.
*/
public class ArrayDuplicateTest {
	/**
	*Тестирование метода, который удаляет дубликаты.
	*/
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        ArrayDuplicate duplicate = new ArrayDuplicate();
        String[] resultArray = duplicate.remove(new String[]{"Hello", "World", "Hello", "WoW", "World"});
        String[] expectArray = {"Hello", "World", "WoW"};
        assertThat(resultArray, is(expectArray));
    }
}