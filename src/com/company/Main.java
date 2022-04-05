package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Cat cat = new Cat();
        Dog dog = new Dog();
        cat.makeSound();
        dog.makeSound();

        cat.eat("fish");
        dog.eat("fish");

        cat.showMood(true);
        dog.showMood(false);
    }
}
