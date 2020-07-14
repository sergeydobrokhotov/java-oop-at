package ru.geekbrains.java.oop.at.dog;

public class Start {

    public static void main(String[] args) {
        Cat tom = new Cat();
        tom.setName("Том");
        Dog spike = new Dog();
        spike.setName("Спайк");
        CatFood catFood = new CatFood();
        catFood.setPrductName("Purina One");

        tom.eat(catFood);
        spike.eat(catFood);

        tom.meows();
        spike.barking();


    }
}