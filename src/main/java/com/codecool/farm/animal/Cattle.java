package com.codecool.farm.animal;

public class Cattle extends Animal {

    @Override
    public void feed() {
        this.setSize(this.getSize() + 2);
    }
}
