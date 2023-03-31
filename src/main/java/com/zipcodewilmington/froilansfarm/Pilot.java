package com.zipcodewilmington.froilansfarm;


public class Pilot extends Person implements Rider{

    public boolean mount() {
        return false;
    }
    public boolean dismount() {
        return false;
    }
}
