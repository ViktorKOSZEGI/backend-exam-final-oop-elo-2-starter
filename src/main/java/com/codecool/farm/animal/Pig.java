package com.codecool.farm.animal;

public class Pig extends Animal {

    @Override
    public void feed() {
        this.setSize(this.getSize() + 1);
    }
}
