package com.example.dagger;

import dagger.Module;
import dagger.Provides;

@Module
public class LithiumIonBatteryModule {

    @Provides
    CarBattery provideCarBattery(){
        LithiumIonBattery lithiumIonBattery = new LithiumIonBattery();
        lithiumIonBattery.logBatteryType();
        return lithiumIonBattery;
    }
}
