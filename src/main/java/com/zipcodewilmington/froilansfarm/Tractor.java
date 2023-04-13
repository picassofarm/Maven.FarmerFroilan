package com.zipcodewilmington.froilansfarm;

public class Tractor extends Vehicle <Farmer> implements FarmVehicle {

    @Override
    public String makeNoise() {
        return "Vroom";
    }
    //Produce<>


}
