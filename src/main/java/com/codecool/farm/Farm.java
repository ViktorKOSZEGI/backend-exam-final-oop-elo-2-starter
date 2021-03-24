package com.codecool.farm;

import com.codecool.farm.animal.Animal;

import java.util.ArrayList;
import java.util.List;

class Farm {
    private List<Animal> animals;

    public Farm(List<Animal> animals) {
        this.animals = animals;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void feedAnimals() {
        for (Animal animal : animals) {
            animal.feed();
        }
    }

    public void butcher(Butcher butcher) {
        for (Animal animal : animals) {
            if (animal.getSize() > 4) {
                animals.remove(animal);
            }
        }
    }

    public boolean isEmpty() {
        return animals.size() == 0;
    }

    public List<String> getStatus() {
        List<String> statuses = new ArrayList<>();
        for (Animal animal : animals) {
            StringBuilder sb = new StringBuilder();
            sb.append("There is a ")
                    .append(animal.getSize())
                    .append(" sized ")
                    .append(animal.getClass().getSimpleName().toLowerCase())
                    .append(" in the farm.");
            statuses.add(sb.toString());
        }
        return statuses;
    }
}
