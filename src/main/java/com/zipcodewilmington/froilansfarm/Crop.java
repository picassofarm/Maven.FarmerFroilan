package com.zipcodewilmington.froilansfarm;

public abstract class Crop<CropType extends Edible> implements Produce<Edible>{
    boolean hasBeenFertilized;
    boolean hasBeenHarvested;
}
