package com.mycompany.webdriver_sample.helper;

import java.util.ArrayList;
import java.util.List;

public class PairList {
    private List<Pair> pairs;

    public PairList() {
        pairs = new ArrayList<>();
    }

    public void addPair(char key, int value) {
        pairs.add(new Pair(key, value));
    }

    public boolean containsKey(char key) {
        for (Pair pair : pairs) {
            if (pair.getKey() == key) {
                return true;
            }
        }
        return false;
    }

    public Object getCountByValue(char key) {
        for (Pair pair : pairs) {
            if (pair.getKey() == key) {
                return pair.getValue();
            }
        }
        return null;
    }

    public void printPairs() {
        for (Pair pair : pairs) {
            System.out.println(pair);
        }
    }

    class Pair {
        char key;
        int value;

        public Pair(char key, int value) {
            this.key = key;
            this.value = value;
        }

        public char getKey() {
            return key;
        }

        public int getValue() {
            return value;
        }

        @Override
        public String toString() {
            return "(" + key + ", " + value + ")";
        }
    }
}
