package com.di;
public class Main {
    public static void main(String[] args) {
        SimpleDIContainer container = new SimpleDIContainer();

        FuelPump fuelPump = new FuelPump();
        Engine engine = new Engine(fuelPump);
        Battery battery = new Battery();

        container.register(FuelPump.class, fuelPump);
        container.register(Engine.class, engine);
        container.register(Battery.class, battery);

        Car car = new Car(
                container.get(Engine.class),
                container.get(Battery.class)
        );

        car.drive();
    }
}
