package com.zipcodewilmington.froilansfarm;


public class Pilot extends Person implements Rider{
    public boolean mount(Rideable<?> r) {
        return false;
    }
    public boolean dismount(Rideable<?> r) {
        return false;
    }
}
