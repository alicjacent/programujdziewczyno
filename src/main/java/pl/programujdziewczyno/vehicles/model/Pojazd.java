package pl.programujdziewczyno.vehicles.model;

/**
 * Created by Lalu on 25.05.2018.
 */
public class Pojazd {

    private Owner owner;

    private String mark;
    private String model;

    private int productionYear;
    private int wheelNumber;
    private String colour;

    private Long speed;
    private Long fuelAmount;

    public void drive(Long finalSpeed) {
        System.out.println("rozpędzam się!");
        for(int i=0; i<=finalSpeed; i += 10){
            speed = speed + 10;
            System.out.println("moja prędkość: " + speed);
        }
    }

    public void stop() {
        System.out.println("uwaga, hamuję!");
        for(int i=speed.intValue(); i<=0; i-=10) {
            speed = speed - 10;
            System.out.println("moja prędkość: " + speed);
        }
    }

    public void refuel(Long refill) {
        System.out.println("Mam " + fuelAmount + " litrów paliwa");
        System.out.println("Tankuję " + refill + " litrów paliwa");
        fuelAmount += refill;
        System.out.println("teraz mam " + fuelAmount + " litrów paliwa");
    }
}
