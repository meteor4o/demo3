package com.example.demo.abst;

public class Lion extends BigCat implements MakeSound{
    @Override
    public String roar() {
        return "Big roar";
    }

    @Override
    public String makeNoise() {
        return "Roar";
    }

    public static void main(String[] args) {
        Lion lion = new Lion();
        System.out.println(lion.makeNoise());
        System.out.println(lion.roar());
    }
}
