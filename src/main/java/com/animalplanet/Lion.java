package com.animalplanet;

import java.util.List;

public class Lion {
    boolean hasMane; // - переменная наличия-отсутствия ГРИВЫ льва
    final Feline feline; // создали в зависимом классе поле -  из класса-зависимости

    //     1. Создать интерфейс для класса-зависимости. - Интерфейс Predator  уже создан
    //     2. Создать в зависимом классе поле того же типа, что и интерфейс
    //        По принципу инкапсуляции, его нужно сделать приватным.
    public Lion(String sex, Feline feline) throws Exception {
        //      3. Создать конструктор с параметром того же типа, что и интерфейс/класс от которого зависим.
        this.feline = feline;  // 4. Внутри конструктора передать значение параметра в созданное поле:

        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }

    public int getKittens() {
        return feline.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return feline.getFood("Хищник");
    }
}