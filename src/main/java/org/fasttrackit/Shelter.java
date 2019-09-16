package org.fasttrackit;

public class Shelter {

    private String shelterName;
    private String adress;
    private Animal animal;

    public Shelter(String shelterName, String adress) {
        this.shelterName = shelterName;
        this.adress = adress;
        this.animal = animal;
    }


    public String getShelterName() {
        return shelterName;
    }

    public String getAdress() {
        return adress;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setShelterName(String shelterName) {
        this.shelterName = shelterName;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
}
