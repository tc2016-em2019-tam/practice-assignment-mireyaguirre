/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica14jan;

/**
 *
 * @author cat_dominguez
 */
public class Dog {
        //Dog properties
    private String breed;
    private int age;
    private double weight;
    private String name;

    public Dog() {
        this.breed = "Halfblood";
    }

    public Dog(String breed) {
        this.breed = breed;
    }

    public Dog(int age, double weight) {
        this.age = age;
        this.weight = weight;
    }

    public Dog(String breed, int age, double weight) {
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws Exception {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be less than 0");
            throw new Exception("Age cannot be less than 0");
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception {
        if (!name.trim().equals("")) {
            this.name = name;
        } else {
            throw new Exception("Name cannot be empty.");
        }
    }

    public void run() {
        System.out.println("I'm " + this.name + " and I'm running");
    }

    public void sleep() {
        System.out.println("ZZZzzz...  (" + this.name + ")");
    }

    public void bark() {
        System.out.println("Woof! (" + this.name + ")");
    }
}
