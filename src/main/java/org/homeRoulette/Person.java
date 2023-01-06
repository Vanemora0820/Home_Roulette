package org.homeRoulette;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private  ArrayList <String> tasks;

    private Person (String name){
        this.name = name;
    }

    public static Person createPersonWithName (String name) {
        return  new Person(name);
    }
    public String getName() {
        return name;
    }

    public ArrayList <String> getTasks() {
        return tasks;
    }

    public void addTask (String task){
        tasks.add(task);
    }


}


