package com.zipcodewilmington.froilansfarm;

public class TomatoPlant extends Crop<Tomato> {
    public Tomato yield(boolean harvestable) {
        if(!harvestable){
            return null;
        }
        return new Tomato();
    }
}
