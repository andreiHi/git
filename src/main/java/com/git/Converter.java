package com.git;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Converter {
    Iterator<Integer> convert(Iterator<Iterator<Integer>> it) {
        return new Iterator<Integer>() {

            private Iterator<Integer> inIter = it.next();

            public boolean hasNext() {
                while (!inIter.hasNext()) {
                    if (!it.hasNext()) {
                        break;
                    }
                    inIter = it.next();
                }
                return inIter.hasNext();
            }

            @Override
            public Integer next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();

                }
                return inIter.next();
            }
        };
    }

    public static void main(String[] args) {
        System.out.println("a".compareTo("b"));
    }

}
