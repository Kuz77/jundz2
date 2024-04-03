package org.example;

class Cat extends Animal {
    public boolean isIndoor;

    public Cat(String name, int age, boolean isIndoor) {
        super(name, age);
        this.isIndoor = isIndoor;
    }

    @Override
    public void makeSound() {
        System.out.println("мяу");
    }

    public void scratch() {
        System.out.println(name + " царапается");
    }
}