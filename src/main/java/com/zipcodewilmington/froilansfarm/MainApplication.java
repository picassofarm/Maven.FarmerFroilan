package com.zipcodewilmington.froilansfarm;

import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Created by leon on 2/26/18.
 */
public class MainApplication {


    public MainApplication() {

        Farm farm = new Farm();
        Pilot froilanda = new Pilot();
        CropRow cropRow1 = new CropRow();
        cropRow1.add(new TomatoPlant());
        CropRow cropRow2 = new CropRow();
        cropRow2.add(new CornStalk());
        CropRow cropRow3 = new CropRow();
        CropRow cropRow4 = new CropRow();
        CropRow cropRow5 = new CropRow();

        ChickenCoop chickenCoop1 = new ChickenCoop();
        List<Chicken> chickens1 = Collections.nCopies(4, new Chicken());
        chickenCoop1.addAll(chickens1);

        ChickenCoop chickenCoop2 = new ChickenCoop();
        List<Chicken> chickens2 = Collections.nCopies(4, new Chicken());
        chickenCoop2.addAll(chickens2);

        ChickenCoop chickenCoop3 = new ChickenCoop();
        List<Chicken> chickens3 = Collections.nCopies(4, new Chicken());
        chickenCoop3.addAll(chickens3);

        ChickenCoop chickenCoop4 = new ChickenCoop();
        List<Chicken> chickens4 = Collections.nCopies(3, new Chicken());
        chickenCoop4.addAll(chickens4);

        Stable stable1 = new Stable();
        List<Horse> horses1 = Collections.nCopies(4, new Horse());
        horses1.addAll(horses1);

        Stable stable2 = new Stable();
        List<Horse> horses2 = Collections.nCopies(3, new Horse());
        horses2.addAll(horses2);

        Stable stable3 = new Stable();
        List<Horse> horses3 = Collections.nCopies(3, new Horse());
        horses3.addAll(horses3);

        Aircraft aircraft = new Aircraft();
    }

    public static void main(String[] args) {


    }


}