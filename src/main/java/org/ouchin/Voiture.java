package org.ouchin;

public class Voiture extends Vehicule{

    private int numberDoors ;
    private boolean automatic ;


    public Voiture(String brand, String model, int year, double basePrice, int numberDoors, boolean automatic) {
        super(brand, model, year, basePrice);
        this.numberDoors = numberDoors;
        this.automatic = automatic;
    }


    @Override
    public double calculateRentalPrice(int days) {
        double price = super.calculateRentalPrice(days);
        if(automatic){
            price += price * 0.10;
        }
        return price;
    }

    @Override
    public void displayType() {
        System.out.println("Type de véhicule : Voiture");
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "Doors : "+ numberDoors+ ", Automatic "+automatic;
    }


}
