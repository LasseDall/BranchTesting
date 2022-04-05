package com.company;

public class Dog extends Animal {
  @Override
  public void makeSound() {
    System.out.println("Vuf");
  }

  @Override
  public boolean eat(String food) {
    return true;
  }

  @Override
  public void showMood(boolean glad) {
    if (glad) {
      System.out.println("Logrer");
    } else {
      System.out.println("Knurrer");
    }
  }
}
