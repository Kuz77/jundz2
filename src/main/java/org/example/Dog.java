package org.example;

class Dog extends Animal {
    public String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Гав");
    }

    public void fetch() {
        System.out.println(name + " несет мячик");
    }
}
