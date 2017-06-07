package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
*Тестирование слияния отсортированных массивов.
*/
public class MergeTest {
	/**
	*Тестирование метода, который осуществляет слияние отсортированных массивов.
	*/
    @Test
    public void whenMergeOneAndTwoThenArrayResult() {
        Merge merge = new Merge();
        int[] resultArray = merge.merge(new int[]{2, 7, 9}, new int[]{1, 3, 8, 20});
        int[] expectArray = {1, 2, 3, 7, 8, 9, 20};
        assertThat(resultArray, is(expectArray));
    }
}