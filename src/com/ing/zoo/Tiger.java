package com.ing.zoo;

import com.ing.zoo.character.Carnivore;

import java.util.Random;

public class Tiger extends Animal implements Carnivore {
    public String trick;

    public Tiger(String name, String helloText, String eatText, String trick) {
        super(name, helloText, eatText);
        this.trick = trick;
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

    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "jumps in tree";
        }
        else
        {
            trick = "scratches ears";
        }
        System.out.println(trick);
    }
}
