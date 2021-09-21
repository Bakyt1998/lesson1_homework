package com.company;

public class Dog extends Animal {

    private String name;
    private ColorEnum colorEnum;


    public Dog(String breed, int age) {
        super(breed, age);
    }

    public Dog(String breed, int age, String name, ColorEnum colorEnum) {
        super(breed, age);
        this.name = name;
        this.colorEnum = colorEnum;
    }

    public ColorEnum getColorEnum() {
        return colorEnum;
    }

    public String getName() {
        return name;
    }

    public void voice() {
        System.out.println("гав гав");
    }

    public final void voice(String das) {
        System.out.println(das);
    }

    public void getInfo(){
        System.out.println("\nName: " + name + "\nЦвет: " + colorEnum + "\nbreed: " + getBreed() + "\nвозраст: " + getAge());
    }


}
