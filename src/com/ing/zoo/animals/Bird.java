package com.ing.zoo.animals;

import com.ing.zoo.character.Carnivore;
import com.ing.zoo.character.Herbivore;
import com.ing.zoo.character.Trick;

public class Bird extends Animal implements Herbivore, Carnivore, Trick {
    /**
     * @param name
     * @param helloText
     * @param eatText   standard constructor for each class
     */
    public Bird(String name, String helloText, String eatText) {
        super(name, helloText, eatText);
    }

    @Override
    public void eatMeat() {

    }

    @Override
    public void eatLeaves() {

    }

    @Override
    public void performTrick() {

    }
}
