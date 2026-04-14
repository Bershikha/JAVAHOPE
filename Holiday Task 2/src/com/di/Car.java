package com.di;

class Car {
    private Engine engine;
    private Battery battery;

    public Car(Engine engine, Battery battery) {
        this.engine = engine;
        this.battery = battery;
    }

    public void drive() {
        battery.supplyPower();
        engine.start();
        System.out.println("Car is running");
    }
}
