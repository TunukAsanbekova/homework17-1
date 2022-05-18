package com.company;

import java.util.Arrays;

public class Farm {
    private String address;
    private String OwnerName;
    private Cow[] cows;
    private Sheep[] sheep;
    public Horse[] horses;

    public Farm(String address, String ownerName, Cow[] cows, Sheep[] sheep, Horse[] horses) {
        this.address = address;
        OwnerName = ownerName;
        this.cows = cows;
        this.sheep = sheep;
        this.horses = horses;
    }

    void infoJailoo() {
        System.out.println("Address: " + getAddress() + ", Name: " + getOwnerName());

        for (DomesticAnimal animal : getCows()) {
            animal.info();
        }
        for (DomesticAnimal animal : getSheep()) {
            animal.info();
        }
        for (DomesticAnimal animal : getHorses()) {
            animal.info();
        }

    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOwnerName() {
        return OwnerName;
    }

    public void setOwnerName(String ownerName) {
        OwnerName = ownerName;
    }

    public Cow[] getCows() {
        return cows;
    }

    public void setCows(Cow[] cows) {
        this.cows = cows;
    }

    public Sheep[] getSheep() {
        return sheep;
    }

    public void setSheep(Sheep[] sheep) {
        this.sheep = sheep;
    }

    public Horse[] getHorses() {
        return horses;
    }

    public void setHorses(Horse[] horses) {
        this.horses = horses;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "address='" + address + '\'' +
                ", OwnerName='" + OwnerName + '\'' +
                ", cows=" + Arrays.toString(cows) +
                ", sheep=" + Arrays.toString(sheep) +
                ", horses=" + Arrays.toString(horses) +
                '}';
    }
}
