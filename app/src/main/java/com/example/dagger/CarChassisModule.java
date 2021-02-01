package com.example.dagger;

import android.util.Log;

import dagger.Module;
import dagger.Provides;

@Module
public class CarChassisModule {

    private int weight;

    public CarChassisModule(int weight) {
        this.weight = weight;
    }

    @Provides
    CarChassis provideCarChassis(){
        Log.d("565656", "provideCarChassis: " + weight);
        return  new CarChassis();
    }

}
