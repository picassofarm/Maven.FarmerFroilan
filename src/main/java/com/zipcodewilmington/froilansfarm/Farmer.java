package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class Farmer extends Person implements Rider<Tractor>, Botanist{


    public CropRow plant() {
        return null;
    }

    public boolean mount() {
        return false;
    }

    public boolean dismount() {
        return false;
    }
}
