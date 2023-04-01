package com.zipcodewilmington.froilansfarm;

public class CornStalk extends Crop<Corn>{
    public Corn yield(boolean harvestable) {
        if(!harvestable){
            return null;
        }
        return new Corn();
    }
}
