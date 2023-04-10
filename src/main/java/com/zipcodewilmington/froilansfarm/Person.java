package com.zipcodewilmington.froilansfarm;

public class Person extends Animal<Edible>{
    @Override
    public String eat(Object food) {
        super.eat(food);
        return "Yum that was a delicious " + food.toString();
    }
}
