package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
*Тестирование циклов.
*/
public class BoardTest {
	/**
	*Тестирование метода, который рисует шахматную доску шириной 2 и высотой 2.
	*/
    @Test
    public void whenBoardWithHeightTwoWidthTwoThenString() {
        Board board = new Board();
        String result = board.paint(2, 2);
        String expected = String.format("X %s X", System.getProperty("line.separator"));
        assertThat(result, is(expected));
    }
	/**
	*Тестирование метода, который рисует шахматную доску шириной 3 и высотой 4.
	*/
    @Test
    public void whenBoardWithHeightFourWidthThreeThenString() {
        Board board = new Board();
        String result = board.paint(3, 4);
        String expected = String.format("X X%s X %<sX X%<s X ", System.getProperty("line.separator"));
        assertThat(result, is(expected));
    }
	/**
	*Тестирование метода, который рисует шахматную доску шириной 5 и высотой 3.
	*/
    @Test
     public void whenBoardWithHeightThreeWidthFiveThenString() {
        Board board = new Board();
        String result = board.paint(5, 3);
        String expected = String.format("X X X%s X X %<sX X X", System.getProperty("line.separator"));
        assertThat(result, is(expected));
    }
}