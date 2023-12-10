package com.ing.zoo;

import com.ing.zoo.character.Herbivore;

import java.util.Random;

public class Zebra extends Animal implements Herbivore {
    public String trick;

    public Zebra(String name, String helloText, String eatText, String trick) {
        super(name, helloText, eatText);
        this.trick = trick;
    }

    @Override
    public void sayHello()
    {
        System.out.println(helloText);
    }

    @Override
    public void eatLeaves()
    {
        System.out.println(eatText);
    }
}
