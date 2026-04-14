package com.di;

class Engine {
    private FuelPump fuelPump;

    public Engine(FuelPump fuelPump) {
        this.fuelPump = fuelPump;
    }

    public void start() {
        fuelPump.pumpFuel();
        System.out.println("Engine started");
    }
}