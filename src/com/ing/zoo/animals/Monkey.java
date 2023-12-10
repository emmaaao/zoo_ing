package com.ing.zoo.animals;

import com.ing.zoo.character.Herbivore;
import com.ing.zoo.character.Trick;

public class Monkey extends Animal implements Herbivore, Trick {

    /**
     * @param name
     * @param helloText
     * @param eatText   standard constructor for each class
     */
    public Monkey(String name, String helloText, String eatText) {
        super(name, helloText, eatText);
    }

    @Override
    public void eatLeaves() {

    }

    @Override
    public void performTrick() {

    }
}
