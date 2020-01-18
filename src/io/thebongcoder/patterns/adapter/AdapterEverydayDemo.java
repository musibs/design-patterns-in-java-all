package io.thebongcoder.patterns.adapter;

import java.util.Arrays;
import java.util.List;

public class AdapterEverydayDemo {

    public static void main(String[] args) {

        Integer[] arrayOfInts = new Integer[]{10,20,30};
        List<Integer> listOfInts = Arrays.asList(arrayOfInts);
        System.out.println(Arrays.toString(arrayOfInts));
        System.out.println(listOfInts);
    }
}
