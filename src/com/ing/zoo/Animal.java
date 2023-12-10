package com.ing.zoo;

public class Animal {
    protected String name;
    protected String helloText;
    protected String eatText;

    /**
     *
     * @param name
     * @param helloText
     * @param eatText
     *
     * standard constructor for each class
     */
    public Animal(String name, String helloText, String eatText) {
        this.name = name;
        this.helloText = helloText;
        this.eatText = eatText;
    }

    /**
     * print out animal greet
     */
    public void sayHello() {
        System.out.println("There is no sound yet.");
    }

    /**
     * getter for name
     * @return name of animal
     */
    public String getName() {
        return name;
    }
}
