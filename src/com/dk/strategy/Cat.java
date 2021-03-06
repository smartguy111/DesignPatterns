package com.dk.strategy;

public class Cat implements Comparable<Cat>{
    int weight, height;

    public Cat(int weight, int height) {
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Cat cat) {
        if (this.weight < cat.weight) return -1;
        else if (this.weight > cat.weight) return 1;
        return 0;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }
}
