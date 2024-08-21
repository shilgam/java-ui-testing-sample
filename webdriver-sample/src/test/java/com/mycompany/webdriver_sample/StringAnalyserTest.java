package com.mycompany.webdriver_sample;

import com.mycompany.webdriver_sample.helper.PairList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringAnalyserTest {
    private final StringAnalyser analyser = new StringAnalyser();

    @Test
    public void getDuplicatedCharsTest() {
        PairList pairList = analyser.getDuplicatedChars("gabcdec");

        Assertions.assertEquals(pairList.getCountByValue('g'), null);
        Assertions.assertEquals(pairList.getCountByValue('a'), null);
        Assertions.assertEquals(pairList.getCountByValue('c'), 2);
    }

    @Test
    public void getDuplicatedCharsEmptyTest() {
        PairList pairList = analyser.getDuplicatedChars("");

        Assertions.assertEquals(pairList.getCountByValue('g'), null);
        Assertions.assertEquals(pairList.getCountByValue('a'), null);
        Assertions.assertEquals(pairList.getCountByValue('c'), null);
    }
}
