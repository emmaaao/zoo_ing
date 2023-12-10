package com.ing.zoo;

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
            } else {
                System.out.println("Unknown command: " + input);
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
