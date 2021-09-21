package com.company;

public final class Puppy extends Dog {

    public Puppy(String breed, int age) {
        super(breed, age);
    }

    @Override
    public void voice() {
        System.out.println("puppy");
    }

}
