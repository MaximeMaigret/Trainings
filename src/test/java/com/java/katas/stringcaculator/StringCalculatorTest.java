package com.java.katas.stringcaculator;

import com.java.katas.stringcaculator.StringCalculator;
import org.junit.Test;

/**
 *
 * @author maxime.maigret
 */
public class StringCalculatorTest {

    @Test
    public void shouldDoNotCalculateIfCannotConvert() {
        String input = "cannot convert";
        assertEquals("addition of 1 number has error.", 0, StringCalculator.add(input));
    }

    @Test
    public void shouldReturnTheCorrectResultIfOneArgument() {
        String input = "5";
        int result = 5;
        assertEquals("addition of 1 number has error.", result, StringCalculator.add(input));
    }

    @Test
    public void shouldReturnTheCorrectResultIfNoneArgument() {
        String input = "";
        int result = 0;
        assertEquals("addition of no number has error.", result, StringCalculator.add(input));
    }

    @Test
    public void shouldReturnTheCorrectResultIfTwoArguments() {
        String input = "4,6";
        int result = 4 + 6;
        assertEquals("addition of 2 numbers has error.", result, StringCalculator.add(input));
    }

}
