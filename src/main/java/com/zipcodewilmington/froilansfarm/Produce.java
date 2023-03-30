package com.zipcodewilmington.froilansfarm;

public interface Produce<T extends Edible> {

    public <T> T yield(boolean harvestable);
}
