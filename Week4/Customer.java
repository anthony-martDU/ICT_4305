package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String customerId;
    private String name;
    private Address address;
    private String phoneNumber;
    private List<Car> cars;

    public Customer(String customerId, String name, Address address, String phoneNumber) {
        this.customerId = customerId;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.cars = new ArrayList<>();
    }

    public String getCustomerId() { return customerId; }
    public String getName() { return name; }
    public Address getAddress() { return address; }
    public String getPhoneNumber() { return phoneNumber; }
    public List<Car> getCars() { return cars; }

//REGISTRATION FOR CARSd
public Car register(String license, CarType type) {
    Car car = new Car(null, null, license, type, this.customerId);
    cars.add(car);
    return car;
}
    @Override
    public String toString() {
        return "Customer{" +
                "id='" + customerId + '\'' +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", phone='" + phoneNumber + '\'' +
                ", cars=" + cars +
                '}';
    }
}