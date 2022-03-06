package com.arika.dev.factory;


import static com.arika.dev.factory.Type.TWO_WHEELER;

class Client {
    public static void main(String[] args) {
        Vehicle twoWheeler = VehicleFactory.createVehicle(TWO_WHEELER);
        Vehicle fourWheeler = VehicleFactory.createVehicle(Type.FOUR_WHEELER);
        twoWheeler.printVehicle();
        fourWheeler.printVehicle();
    }
}
