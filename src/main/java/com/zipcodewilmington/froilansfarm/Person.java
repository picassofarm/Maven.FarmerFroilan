package com.zipcodewilmington.froilansfarm;

public class Person extends Animal<Edible> implements Rider{
    public boolean mount() {
        return false;
    }

    public boolean dismount() {
        return false;
    }
}
