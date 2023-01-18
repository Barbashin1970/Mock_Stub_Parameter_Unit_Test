package com.example;

public class Main {

    public static void main(String[] args) throws Exception {

        Feline feline = new Feline();
        Lion lion = new Lion("Самка", feline);
        System.out.println("Грива: " + lion.doesHaveMane());
        System.out.println("Детёныши: " + lion.getKittens());
        System.out.println("Пища: " + lion.getFood());
    }
}
