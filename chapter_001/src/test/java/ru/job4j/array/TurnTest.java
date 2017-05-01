package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
*Тестирование переворачивания массива.
*/
public class TurnTest {
	/**
	*Тестирование метода, который выдает заданный массив задом наперед.
	*/
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        Turn turn = new Turn();
        int[] resultArray = turn.back(new int[]{2, 6, 1, 4});
        int[] expectArray = {4, 1, 6, 2};
        assertThat(resultArray, is(expectArray));
    }
	/**
	*Тестирование метода, который выдает заданный массив задом наперед.
	*/
    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        Turn turn = new Turn();
        int[] resultArray = turn.back(new int[]{1, 2, 3, 4, 5});
        int[] expectArray = {5, 4, 3, 2, 1};
        assertThat(resultArray, is(expectArray));
    }
}