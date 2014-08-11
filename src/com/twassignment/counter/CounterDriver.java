package com.twassignment.counter;

/**
 * Created by alisonps on 8/11/14.
 * Driver to test counter: increments 5 times, calls total, prints total
 */
public class CounterDriver {
    public static void main(String[] args) {

        Counter testCounter = new Counter();
        int testTotal = 0;

        for(int i = 0; i < 5; i = i +1) {
            testCounter.increment();
        }

        testTotal = testCounter.total();
        System.out.println(testTotal);
    }
}
