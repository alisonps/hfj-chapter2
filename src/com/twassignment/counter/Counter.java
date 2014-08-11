package com.twassignment.counter;

/**
 * Created by alisonps on 8/11/14.
 */
public class Counter {
    private int total;

    Counter(){
        total = 0;
    }

    void increment(){
        total = total + 1;
    }

    int total(){
        return total;
    }
}
