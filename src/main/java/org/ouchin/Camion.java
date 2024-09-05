package org.ouchin;

public class Camion extends Vehicule {

    private double MaxCapacity ;


    public Camion(String brand, String model, int year, double basePrice, double maxCapacity) {
        super(brand, model, year, basePrice);
        MaxCapacity = maxCapacity;
    }


    @Override
    public double calculateRentalPrice(int days) {
        double prix = super.calculateRentalPrice(days);
        if (MaxCapacity > 10) {
            prix += prix * 0.30;
        }
        return prix;
    }

    @Override
    public void displayType() {
        System.out.println("Type de véhicule : Camion");
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "max capacity"+MaxCapacity;
    }


}
