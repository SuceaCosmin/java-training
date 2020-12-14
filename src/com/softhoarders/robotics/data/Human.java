package com.softhoarders.robotics.data;


import java.util.Objects;

public class Human implements IEntity {

    public static int NumberOfHumans = 0;

    private String name;
    private int age;
    private int money;

    public Human(String name, int age, int money) {
        this.name = name;
        this.age = age;
        this.money = money;
        incrementHumans();
    }

    public static void incrementHumans() {
        NumberOfHumans++;
    }

    public Human() {
        NumberOfHumans++;
    }

    public void SayHello() {
        System.out.println("Hey there, i'm " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public static Human ValueOf(Human human) {

        Human human1 = new Human(human.name, human.age, human.money);

        return human1;

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age &&
                money == human.money &&
                Objects.equals(name, human.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, money);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", money=" + money +
                '}';
    }
}
