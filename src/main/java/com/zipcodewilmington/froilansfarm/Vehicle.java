package com.zipcodewilmington.froilansfarm;

public abstract class Vehicle <RiderType extends Rider> implements Rideable, NoiseMaker, Edible {

    private void ride(){
    }
    public abstract String makeNoise();

    }


