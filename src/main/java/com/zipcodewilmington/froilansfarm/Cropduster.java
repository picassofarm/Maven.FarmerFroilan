package com.zipcodewilmington.froilansfarm;

public class Cropduster extends Aircraft implements FarmVehicle{

    CropRow cropRow;
    @Override
    public String fly(CropRow cropRow) {
        this.cropRow = cropRow;
        return "Whoosh";
    }

    @Override
    public String makeNoise() {
        return "Vroom";
    }
}



