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
        String[] resultArray = duplicate.remove(new String[]{"a", "b", "b", "c", "d", "d", "c"});
        String[] expectArray = {"a", "b", "c", "d"};
        assertThat(resultArray, is(expectArray));
    }
}