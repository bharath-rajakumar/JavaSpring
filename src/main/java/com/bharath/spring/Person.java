package com.bharath.spring;

/**
 * Created by bharathrajakumar on 7/23/16.
 */
public class Person {
    int id;
    String name;

    public Person() {

    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void speak() {
        System.out.println("Hello I am person");
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
