package org.example;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private String lotId;
    private Address address;
    private int capacity;
    private List<Car> parkedCars;

    public ParkingLot(String lotId, Address address, int capacity) {
        this.lotId = lotId;
        this.address = address;
        this.capacity = capacity;
        this.parkedCars = new ArrayList<>();
    }

    // entry method
    public void entry(Car car) {
        if (parkedCars.size() < capacity) {
            parkedCars.add(car);
            System.out.println("Car " + car.getLicense() + " entered lot " + lotId);
        } else {
            System.out.println("Parking lot " + lotId + " is full.");
        }
    }

    @Override
    public String toString() {
        return "ParkingLot{" +
                "lotId='" + lotId + '\'' +
                ", address=" + address +
                ", capacity=" + capacity +
                ", parkedCars=" + parkedCars.size() +
                '}';
    }
}