package com.example;

public class Main {  // класс для демонстрации методов и ручной проверки

    public static void main(String[] args) throws Exception {

        Feline feline = new Feline();  // создали новый объект семейства Кошачьих
        System.out.println("У кошачьих обычно детёнышей - "+ feline.getKittens());
        Lion lion = new Lion("Самка", feline);  // создали самку класса Лев с методами класса кошачьих
        System.out.println("У этого льва Грива: " + lion.doesHaveMane()); // проверили метод Грива
        System.out.println("У этого льва Детёныши: " + feline.getKittens(3));  // проверили метод детеныши
        System.out.println("У этого льва Пища: " + lion.getFood());  // проверили метод пища

        Cat cat = new Cat(feline);
        System.out.println("У этого кота звук: "+ cat.getSound());
        System.out.println("У этого кота еда: "+ cat.getFood());
        Animal animal = new Animal();
        System.out.println("У этого животного еда: "+ animal.getFood("Wolf"));
    }
}
