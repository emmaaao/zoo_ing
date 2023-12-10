package com.ing.zoo.animals;

import com.ing.zoo.character.Carnivore;

public class Lion extends Animal implements Carnivore {
    public Lion(String name, String helloText, String eatText) {
        super(name, helloText, eatText);
    }

    @Override
    public void sayHello()
    {
        System.out.println(helloText);
    }

    @Override
    public void eatMeat()
    {
        System.out.println(eatText);
    }
}
