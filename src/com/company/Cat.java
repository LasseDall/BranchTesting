package com.company;

public class Cat extends Animal {

  public void makeSound() {
    System.out.println("Miav");
  }

  @Override
  public boolean eat(String food) {
    return true;
  }

  @Override
  public void showMood(boolean glad) {
    if (glad) {
      System.out.println("Spinder");
    } else {
      System.out.println("Hvæser");
    }
  }
}
