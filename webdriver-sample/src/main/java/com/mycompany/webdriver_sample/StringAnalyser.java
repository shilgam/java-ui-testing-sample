package com.mycompany.webdriver_sample;

import com.mycompany.webdriver_sample.helper.PairList;

public class StringAnalyser {

    /**
     * NOTE: Print results separately for testing purpose
     */
    public void printDuplicatedChars(String inputString) {
        getDuplicatedChars(inputString).printPairs();
    }

    public PairList getDuplicatedChars(String inputString) {
        PairList pairList = new PairList();

        for (int i = 0; i < inputString.length(); i++) {
            int counter = 0;
            char firstChar = 0;

            for (int j = 0; j < inputString.length(); j++) {
                firstChar = inputString.charAt(i);
                char currentChar = inputString.charAt(j);
                if (firstChar == currentChar) {
                    counter = counter + 1;
                }
            }
            if (counter > 1) {
                if (!pairList.containsKey(firstChar)) {
                    pairList.addPair(firstChar, counter);
                }
            }
        }

        return pairList;
    }
}
