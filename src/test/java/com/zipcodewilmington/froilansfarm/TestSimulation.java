package com.zipcodewilmington.froilansfarm;

import org.junit.Before;
import org.junit.Test;

import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class TestSimulation {
    Farm farm;
    Pilot froilanda;

    @Before
    public void testSetup(){
        farm = new Farm();
        Pilot froilanda = new Pilot();
        Farmer froilan = new Farmer();
        farm.house.add(froilan);
        farm.house.add(froilanda);
        Field field = new Field();
        CropRow cropRow1 = new CropRow();
        for (int i = 0; i < 5; i++) {
            cropRow1.add(new TomatoPlant());
        }
        CropRow cropRow2 = new CropRow();
        for (int i = 0; i < 5; i++) {
            cropRow2.add(new CornStalk());
        }
        CropRow cropRow3 = new CropRow();
        for (int i = 0; i < 5; i++) {
            cropRow2.add((Math.random() > .5) ? new CornStalk() : new TomatoPlant());
        }
        CropRow cropRow4 = new CropRow();
        for (int i = 0; i < 5; i++) {
            cropRow2.add((Math.random() > .5) ? new CornStalk() : new TomatoPlant());
        }
        CropRow cropRow5 = new CropRow();
        for (int i = 0; i < 5; i++) {
            cropRow2.add((Math.random() > .5) ? new CornStalk() : new TomatoPlant());
        }
        field.add(cropRow1);
        field.add(cropRow2);
        field.add(cropRow3);
        field.add(cropRow4);
        field.add(cropRow5);
        farm.fields.add(field);

        double r;
        for(int i = 0; i < 50; i++){
          farm.cornSilo.add(new Corn());
          farm.tomatoSilo.add(new Tomato());
          farm.carton.add(new Egg());
       }

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
        stable1.addAll(horses1);

        Stable stable2 = new Stable();
        List<Horse> horses2 = Collections.nCopies(3, new Horse());
        stable2.addAll(horses2);

        Stable stable3 = new Stable();
        List<Horse> horses3 = Collections.nCopies(3, new Horse());
        stable3.addAll(horses3);

        Aircraft aircraft = new Cropduster();
        Tractor tractor = new Tractor();
        farm.garage.add(aircraft);
        farm.garage.add(tractor);

        farm.stable.add(stable1);
        farm.stable.add(stable2);
        farm.stable.add(stable3);

        farm.coop.add(chickenCoop1);
        farm.coop.add(chickenCoop2);
        farm.coop.add(chickenCoop3);
        farm.coop.add(chickenCoop4);
    }

    @Test
    public void thePlotChickens() {
        Consumer<Farm> morning = (farm) -> {
            int num;
            for (Stable s: farm.stable) {
                for(Horse h: s){
                    num = (int) Math.round(Math.random());
//                    farm.house.get(num).mount(h);
//                    farm.house.get(num).dismount(h);
                    h.eat(farm.tomatoSilo.remove(0));
                    h.eat(farm.tomatoSilo.remove(0));
                    h.eat(farm.tomatoSilo.remove(0));
                }
            }

            farm.house.get(0).eat(farm.cornSilo.remove(0));
            farm.house.get(0).eat(farm.tomatoSilo.remove(0));
            farm.house.get(0).eat(farm.tomatoSilo.remove(0));
            for (int i = 0; i < 5; i++) {
                farm.house.get(0).eat(farm.carton.remove(0));
            }

            farm.house.get(1).eat(farm.cornSilo.remove(0));
            farm.house.get(1).eat(farm.cornSilo.remove(0));
            farm.house.get(1).eat(farm.tomatoSilo.remove(0));
            farm.house.get(1).eat(farm.carton.remove(0));
            farm.house.get(1).eat(farm.carton.remove(0));
       };

        //sunday
//        farm.house.get(0).plant(farm.fields.get(0)); //these can be uncommented once the methods are written
//        farm.house.get(0).plant(farm.fields.get(0));
//        farm.house.get(0).plant(farm.fields.get(0));


        //monday
//        farm.house.get(1).mount(farm.garage.get(0));
//        farm.garage.get(0).fly(farm.fields);
//        farm.garage.get(0).fertilize();
//        farm.house.get(1).dismount(farm.garage.get(0));

        //tuesday
//        farm.house.get(0).mount(farm.garage.get(1));
//        farm.garage.get(1).harvest(farm, farm.fields);
//        farm.house.get(0).dismount(farm.garage.get(1));

        //wednesday
    }
}