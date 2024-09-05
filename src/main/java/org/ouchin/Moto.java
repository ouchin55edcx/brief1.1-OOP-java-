package org.ouchin;

public class Moto extends Vehicule {

    private  boolean AllTerrain ;


    public Moto(String brand, String model, int year, double basePrice, boolean allTerrain) {
        super(brand, model, year, basePrice);
        AllTerrain = allTerrain;
    }


    @Override
    public double calculateRentalPrice(int days) {
        double price =  super.calculateRentalPrice(days);
        if (AllTerrain){
            return price += price *0.20;
        }
        return price;
    }

    @Override
    public void displayType() {
        System.out.println("Type de véhicule : Moto");
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "All terrain :"+AllTerrain;
    }
}
