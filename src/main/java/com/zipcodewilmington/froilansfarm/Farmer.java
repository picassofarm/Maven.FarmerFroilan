package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class Farmer extends Person implements Botanist, Rider{
    boolean isRiding = false;
    Rideable currentMount = null;
    public CropRow plant(CropRow cropRow, Crop<?> crop) {
        cropRow.add(crop);
        return cropRow;
    }

    public boolean mount(Rideable<?> r) {
        if(!isRiding){
            isRiding = true;
            currentMount = r;
        }else{
            System.out.println("I'm already ridin' somethin' ya darn tootin' fool!");
        }
        return isRiding;
    }
    public boolean dismount(Rideable<?> r) {
        if(isRiding){
            isRiding = false;
            currentMount = null;
        }else{
            System.out.println("I ain't ridin' nothin' ya city slicker!");
        }
        return isRiding;
    }
}
