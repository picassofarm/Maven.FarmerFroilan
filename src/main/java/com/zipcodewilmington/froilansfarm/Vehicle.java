package com.zipcodewilmington.froilansfarm;

public abstract class Vehicle <RiderType extends Rider> implements Rideable, NoiseMaker, Edible {
    public abstract String makeNoise();

}
