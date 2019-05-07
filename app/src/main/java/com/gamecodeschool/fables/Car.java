package com.gamecodeschool.fables;

import android.util.Log;

public class Car {
    private String color;
    private String bodyType;
    private int wheels;
    private int speed;

    public Car(String color, String bodyType, int wheels, int speed) {
        this.color = color;
        this.bodyType = bodyType;
        this.wheels = wheels;
        this.speed = speed;
    }

    public String getcolor() {
        return color;
    }

    public void setcolor(String color) {
        this.color = color;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void carryGoods(){
        Log.d("Car", "The car is carrying goods");
    }

    public void hoot(){
        Log.d("Car", "Peeeeeeep! Peeeeep");
    }

    public int accelerate(int acceleration){
        speed = speed + acceleration;
        return speed;
    }

    public int decelerate(int deceleration){
        speed = speed - deceleration;
        return speed;
    }

    public void stop(){
        speed = speed - speed;
    }

}
