package com.zipcodewilmington.froilansfarm;

public class Vehicle <RiderType extends Rider> implements Rideable, NoiseMaker, Edible {

    private void ride(){
    }

    public String makeNoise(){

        return "vroom";
    }
}
