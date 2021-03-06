package com.dk.strategy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Cat[] a = {new Cat(3,3), new Cat(5,5), new Cat(1,1)};
        Sorter<Cat> sorter = new Sorter<>();
        Comparator<Cat> comparator = new CatComparator();
        sorter.sort(a, comparator);
        System.out.println(Arrays.toString(a));

        Dog[] d = {new Dog(1), new Dog(4), new Dog(2)};
        Sorter<Dog> sorter1 = new Sorter<>();
        Comparator<Dog> comparator1 = new DogComparator();
        sorter1.sort(d, comparator1);
        System.out.println(Arrays.toString(d));
    }
}
