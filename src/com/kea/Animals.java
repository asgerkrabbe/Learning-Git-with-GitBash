package com.kea;

abstract class Animals {

    public String name;
    public String sex;
    public int age;
    public double weight;
    public String color;

    public void breathe() {
    }

    public String eat(String food) {
        return food;
    }

    public String run(String destination) {
        return destination;
    }

    public int sleep(int hours) {
        return hours;
    }
}

class Cat extends Animals {

    public Cat(String name, String sex, int age, double weight, String color, boolean isNasty) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.isNasty = isNasty;
    }

    private boolean isNasty;

    public void meow() {
    }

    @Override
    public String toString() {
        return "name: " + name +
                "\nsex: " + sex +
                "\nage: " + age +
                "\nweight: " + weight +
                "\ncolor: " + color +
                "\nisNasty: " + isNasty;
    }
}


class Dog extends Animals {

    public Dog(String name, String sex, int age, double weight, String color, String bestFriend) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.bestFriend = bestFriend;
    }

    @Override
    public String toString() {
        return "\nname: " + name +
                "\nsex: " + sex +
                "\nage: " + age +
                "\nweight: " + weight +
                "\ncolor: " + color +
                "\nbestFriend: " + bestFriend;
    }

    private String bestFriend;

    public void bark() {
    }
}
