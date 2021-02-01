package com.example.dagger;

import javax.inject.Inject;

public class CarEngine {
    EngineFlap engineFlap;


    @Inject
    public CarEngine(EngineFlap engineFlap) {

    }
}
