package ru.geekbrains.java.oop.at.parent;

import com.sun.istack.internal.NotNull;
import ru.geekbrains.java.oop.at.dog.CatFood;

public class Animal {
    protected String name;

    public void eat(CatFood catFood) {
        System.out.println(name + " кушает " + catFood.getPrductName());

    }

    public String getName() {
        return name;
    }

    public void setName(@NotNull String name) {

        this.name = name;
    }
}