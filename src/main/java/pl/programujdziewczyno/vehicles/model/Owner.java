package pl.programujdziewczyno.vehicles.model;

/**
 * Created by Lalu on 25.05.2018.
 */
public class Owner {

    private String name;
    private String surname;
    private int age;
    private int insuranceDiscount;

    public Owner(String name, String surname, int age, int insuranceDiscount) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.insuranceDiscount = insuranceDiscount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getInsuranceDiscount() {
        return insuranceDiscount;
    }

    public void setInsuranceDiscount(int insuranceDiscount) {
        this.insuranceDiscount = insuranceDiscount;
    }
}
