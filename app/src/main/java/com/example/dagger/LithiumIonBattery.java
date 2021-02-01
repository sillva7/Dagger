package com.example.dagger;

import android.util.Log;

import javax.inject.Inject;

public class LithiumIonBattery implements CarBattery {
    @Override
    public void logBatteryType() {
        Log.d("565656", "Car battery");
    }


    @Inject
    public LithiumIonBattery() {
    }
}
