package com.example.dagger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        EngineFlap engineFlap = new EngineFlap();
//        CarEngine carEngine = new CarEngine(engineFlap);
//        CarChassis carChassis = new CarChassis();
//        CarBattery carBattery = new CarBattery();
//        Car car = new Car(carEngine, carChassis, carBattery);

       // CarComponent carComponent = DaggerCarComponent.create();
//car = carComponent.getCar();

        CarComponent carComponent = DaggerCarComponent.builder()
                .carChassisModule(new CarChassisModule(1))
                .build();
        carComponent.inject(this);
        car.move();

    }
}