package com.zipcodewilmington.froilansfarm;


public class Pilot extends Person implements Rider<Aircraft>{

    public boolean mount() {
        return false;
    }
    public boolean dismount() {
        return false;
    }
}
