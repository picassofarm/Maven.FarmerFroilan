package com.zipcodewilmington.froilansfarm;

public interface Rider <RideableType extends Rideable>{
    public boolean mount();

    public boolean dismount();
}
