package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class Farmer extends Person implements Botanist, Rider{

    public CropRow plant(CropRow cropRow, Crop<?> crop) {
        cropRow.add(crop);
        return cropRow;
    }

    public boolean mount(Rideable<?> r) {
        return true;
    }

    public boolean dismount(Rideable<?> r) {
        return false;
    }
}
