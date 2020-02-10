package com.git;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Converter {
    Iterator<Integer> convert(Iterator<Iterator<Integer>> it) {
        return new Iterator<Integer>() {


            private Iterator<Integer> insideIterator = it.next();

            private void skipEmpty() {
                while (condition()) {
                    insideIterator = it.next();
                }
            }

            private boolean condition() {
                return !insideIterator.hasNext();
            }

            @Override
            public boolean hasNext() {
                insideIterator = (condition() && it.hasNext())
                        ? it.next() : insideIterator;
                return insideIterator.hasNext();
            }

            @Override
            public Integer next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                return insideIterator.next();
            }
        };
    }

    public static void main(String[] args) {
        int [] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            char sex = 'man';
        }

    }

}
