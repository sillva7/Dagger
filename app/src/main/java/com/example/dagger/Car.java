package com.example.dagger;

import android.util.Log;

import javax.inject.Inject;

public class Car {

    CarEngine carEngine;
    CarChassis carChassis;
    CarBattery carBattery;


    @Inject
    public Car(CarEngine carEngine, CarChassis carChassis, CarBattery carBattery) {
        this.carEngine = carEngine;
        this.carChassis = carChassis;
        this.carBattery = carBattery;
    }




    public  void move(){
        Log.d("565656", "Car is moving");
    }
}
