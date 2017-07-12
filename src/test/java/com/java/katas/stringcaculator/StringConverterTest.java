package com.java.katas.stringcaculator;

import org.junit.Test;

/**
 *
 * @author maxime.maigret
 */
public class StringConverterTest {

    @Test
    public void shouldConvertStringToListNumber() {
        String inputNumbersCorrect = "1,2";

    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldNotConvertIfSpaceDelimiter() {
        String inputNumbersWrongFormatSpaceDelimiters = "1 2";
        StringConverter.convert(inputNumbersWrongFormatSpaceDelimiters);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldNotConvertLetters() {
        String inputLetters = "texte";
        StringConverter.convert(inputLetters);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldNotConvertWrongDelimiter() {
        String inputNumbersWrongFormat = "1-2";
        StringConverter.convert(inputNumbersWrongFormat);
    }
}
