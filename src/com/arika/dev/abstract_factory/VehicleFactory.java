package com.arika.dev.abstract_factory;

public class VehicleFactory {
    static Vehicle createVehicle(VehicleAbstractFactory vehicleAbstractFactory){
        return vehicleAbstractFactory.createVehicle();
    }
}
