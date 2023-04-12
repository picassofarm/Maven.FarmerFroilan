package com.zipcodewilmington.froilansfarm;


import java.sql.SQLOutput;

public class Pilot extends Person implements Rider{
    boolean isRiding = false;

    public boolean mount(Rideable<?> r) {
        if(!isRiding){
            isRiding = true;
        }else{
            System.out.println("I'm already ridin' somethin' ya darn tootin' fool!");
        }
        return isRiding;
    }
    public boolean dismount(Rideable<?> r) {
        if(isRiding){
            isRiding = false;
        }else{
            System.out.println("I ain't ridin' nothin' ya city slicker!");
        }
        return isRiding;
    }
}
