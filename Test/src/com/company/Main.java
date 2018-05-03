package com.company;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String [] abc = StringGenerator.generator(2,"abcde");
        //String abc [] ={"abc","cfg","efg","hij"};

       Arrays.sort(abc);
        //System.out.println(abc[10]);
        System.out.println(BinarySearch.binarySearch(abc,abc[0],0,abc.length));
    }
}
