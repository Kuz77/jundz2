package org.example;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog("корг", 5, "корги"),
                new Cat("домашний барсик", 3, true),
                new Dog("пуд", 2, "пудель"),
                new Cat("уличный мурзик", 4, false)
        };


        for (Animal animal : animals) {
            System.out.println("Name: " + animal.name + ", Age: " + animal.age);
            if (animal instanceof Dog) {
                Dog dog = (Dog) animal;
                System.out.println("Порода: " + dog.breed);
            } else if (animal instanceof Cat) {
                Cat cat = (Cat) animal;
                System.out.println("Домашний? " + cat.isIndoor);
            }
            System.out.println("                     ");
        }


        for (Animal animal : animals) {
            try {
                Method makeSoundMethod = animal.getClass().getMethod("makeSound");
                makeSoundMethod.invoke(animal);
            } catch (Exception e) {

            }
        }
    }
}