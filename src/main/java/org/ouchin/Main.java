package org.ouchin;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Vehicule voiture = new Voiture("Toyota", "Corolla", 2021 , 500, 5 , true);
        Vehicule moto = new Moto("Honda", "CBR", 2019, 300, true);
        Vehicule camion = new Camion("Volvo", "FH16", 2018, 1000, 12);


        List<Vehicule> vehicules = new ArrayList<>();
        vehicules.add(voiture);
        vehicules.add(moto);
        vehicules.add(camion);


        for (Vehicule vehicule : vehicules){
            vehicule.displayType();
            System.out.println(vehicule.getDescription());
            System.out.println("Price in 3 days "+vehicule.calculateRentalPrice(3));
            System.out.println();
        }
    }
}