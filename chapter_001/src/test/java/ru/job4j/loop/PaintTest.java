package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
*Тестирование циклов.
*/
public class PaintTest {
	/**
	*Тестирование метода, который рисует пирамиду высотой 2.
	*/
    @Test
    public void whenPiramidWithHeightTwoThenStringWithTwoRows() {
        Paint paint = new Paint();
        String result = paint.piramid(2);
        String expected = String.format(" ^ %s^^^", System.getProperty("line.separator"));
        assertThat(result, is(expected));
    }
	/**
	*Тестирование метода, который рисует пирамиду высотой 3.
	*/
    @Test
    public void whenPiramidWithHeightThreeThenStringWithThreeRows() {
        Paint paint = new Paint();
        String result = paint.piramid(3);
        String expected = String.format("  ^  %s ^^^ %s^^^^^", System.getProperty("line.separator"), System.getProperty("line.separator"));
        assertThat(result, is(expected));
    }
	/**
	*Тестирование метода, который рисует пирамиду высотой 5.
	*/
    @Test
    public void whenPiramidWithHeightFourThenStringWithFourRows() {
        Paint paint = new Paint();
        String result = paint.piramid(4);
        String expected = String.format("   ^   %s  ^^^  %s ^^^^^ %s^^^^^^^", System.getProperty("line.separator"), System.getProperty("line.separator"), System.getProperty("line.separator"));
        assertThat(result, is(expected));
    }
}