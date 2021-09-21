package com.company;

public class Animal {
    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    private String breed;
    private int age;

    public Animal(String breed, int age) {
        this.breed = breed;
        this.age = age;
    }
}
