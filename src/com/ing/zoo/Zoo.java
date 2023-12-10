package com.ing.zoo;

import com.ing.zoo.animals.*;
import com.ing.zoo.character.Carnivore;
import com.ing.zoo.character.Herbivore;
import com.ing.zoo.character.Trick;

import java.util.ArrayList;
import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        String[] commands = new String[4];
        commands[0] = "hello";
        commands[1] = "give leaves";
        commands[2] = "give meat";
        commands[3] = "perform trick";

        ArrayList<Animal> animals = getAnimals();


        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");

        String input = scanner.nextLine();
        for (Animal animal : animals) {
            if (input.equals(commands[0] + " " + animal.getName())) {
                animal.sayHello();
                break;
            }
            if (input.equals(commands[0])) {
                System.out.print(animal.getName() + " says: ");
                animal.sayHello();
            } else if (input.equals(commands[1])) {
                if (animal instanceof Herbivore) {
                    System.out.print(animal.getName() + " says: ");
                    ((Herbivore) animal).eatLeaves();
                }
            } else if (input.equals(commands[2])) {
                if (animal instanceof Carnivore) {
                    System.out.print(animal.getName() + " says: ");
                    ((Carnivore) animal).eatMeat();
                }
            } else if (input.equals(commands[3])) {
                if (animal instanceof Trick) {
                    System.out.print(animal.getName() + " says: ");
                    ((Trick) animal).performTrick();
                }
            } else {
                System.out.println("Unknown command: " + input);
                break;
            }
        }
    }

    private static ArrayList<Animal> getAnimals() {
        Lion henk = new Lion("henk", "roooaoaaaaar", "nomnomnom thx mate");
        Hippo elsa = new Hippo("elsa", "splash", "munch munch lovely");
        Pig dora = new Pig("dora", "splash", "", "");
        Tiger wally = new Tiger("wally", "rraaarww", "nomnomnom oink wubalubadubdub", "");
        Zebra marty = new Zebra("marty", "zebra zebra", "munch munch zank yee bra", "");

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(henk);
        animals.add(elsa);
        animals.add(dora);
        animals.add(wally);
        animals.add(marty);
        return animals;
    }
}
