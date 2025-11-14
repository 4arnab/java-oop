package com.animal;

abstract public class Animal {
    private  String name;
    abstract public  void makeSound();

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
