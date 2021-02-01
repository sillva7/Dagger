package com.example.dagger;


import dagger.Component;

@Component(modules = {CarChassisModule.class, LithiumIonBatteryModule.class})
public interface CarComponent {

    void inject(MainActivity mainActivity);//в каком активити создавать


//    Car getCar();
}
