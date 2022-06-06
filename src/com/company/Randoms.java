package com.company;

import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random = new Random();
    protected final int min;
    protected final int max;

    public Randoms(int min, int max) {
        random.ints();
        this.max = max - min;
        this.min = min + 1;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return random.nextInt(max) + min;
            }
        };
    }
}