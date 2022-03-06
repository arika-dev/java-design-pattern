package com.arika.dev.abstract_factory;

public class FourWheelerFactory implements VehicleAbstractFactory {
    @Override
    public Vehicle createVehicle() {
        return new FourWheeler();
    }
}
