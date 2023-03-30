package com.zipcodewilmington.froilansfarm;

public interface Rider <RidableType extends Rider>{
    public boolean mount();

    public boolean dismount();
}
