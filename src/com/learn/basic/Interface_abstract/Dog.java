package com.learn.basic.Interface_abstract;

public class Dog extends Animal implements DoSomething,EatSomething {
    @Override
    public String getName() {
        return "dog";
    }

    @Override
    public String getAnimalName() {
        return "name:dog";
    }

    @Override
    public String eat() {
        System.out.println(EatSomething.getPlaceName());
        return "bone";
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog.eat());
        System.out.println(dog.getAnimalName());
        System.out.println(dog.getName());
    }
}
