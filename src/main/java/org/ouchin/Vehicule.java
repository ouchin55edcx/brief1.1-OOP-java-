package org.ouchin;

public class Vehicule {

    private final String brand;
    private final String model;
    private final int year;
    private final double basePrice;


    public Vehicule(String brand, String model, int year, double basePrice) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.basePrice = basePrice;
    }

    public double calculateRentalPrice(int days) {
        return basePrice * days;
    }

    public void displayType() {
        System.out.println("Vehicle type: Generic");
    }

    public String getDescription() {
        return "Brand: " + brand + ", Model: " + model + ", Year: " + year;
    }

}
