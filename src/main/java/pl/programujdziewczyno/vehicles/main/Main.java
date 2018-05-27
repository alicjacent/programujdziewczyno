package pl.programujdziewczyno.vehicles.main;

import pl.programujdziewczyno.vehicles.model.Colour;
import pl.programujdziewczyno.vehicles.model.Owner;
import pl.programujdziewczyno.vehicles.model.Vehicle;

/**
 * Created by Lalu on 25.05.2018.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("działam!");
        Vehicle vehicle = new Vehicle(new Owner("Jan", "Nowak", 55, 30),
                "Audi", "A3", 2005, 4,
                Colour.BLACK, 0, 12.5f);


        System.out.println(vehicle.toString());
        vehicle.fillTank(12.5F);
        vehicle.drive(50);
    }
}
