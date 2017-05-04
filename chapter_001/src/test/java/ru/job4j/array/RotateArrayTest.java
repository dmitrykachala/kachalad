package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
*Тестирование сортировки массива.
*/
public class RotateArrayTest {
	/**
	*Тестирование метода, который поворачивает двумерный массив 2*2.
	*/
    @Test
    public void whenRotateTwoRowTwoColArrayThenRotatedArray() {
        RotateArray rt = new RotateArray();
		int[][] resultArray = rt.rotate(new int[][]{{1, 5}, {7, 3}});
        int[][] expectArray = {{7, 1}, {3, 5}};
        assertThat(resultArray, is(expectArray));
    }
	/**
	*Тестирование метода, который поворачивает двумерный массив 3*3.
	*/
    @Test
    public void whenRotateThreeRowThreeColArrayThenRotatedArray() {
        RotateArray rt = new RotateArray();
		int[][] resultArray = rt.rotate(new int[][]{{3, 7, 5}, {1, 8, 4}, {2, 6, 9}});
        int[][] expectArray = {{2, 1, 3}, {6, 8, 7}, {9, 4, 5}};
        assertThat(resultArray, is(expectArray));
    }
}