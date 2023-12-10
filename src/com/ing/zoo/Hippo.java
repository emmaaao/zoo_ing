package com.ing.zoo;

import com.ing.zoo.character.Herbivore;

public class Hippo extends Animal implements Herbivore {
    public Hippo(String name, String helloText, String eatText) {
        super(name, helloText, eatText);
    }


    @Override
    public void sayHello() {
        System.out.println(helloText);
    }

    @Override
    public void eatLeaves() {
        System.out.println(eatText);
    }
}
