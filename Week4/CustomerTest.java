package org.example;

public class CustomerTest {

    public static void main(String[] args) {
        Address address = new Address("123 Main St", "", "Boise", "ID", "83702");
        Customer customer = new Customer("C001", "Alice Smith", address, "555-1234");

        Car car = customer.register("ABC123", CarType.COMPACT);


        System.out.println(car);
        System.out.println(customer);
    }
}