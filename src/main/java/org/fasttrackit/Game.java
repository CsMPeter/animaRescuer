package org.fasttrackit;

public class Game {
    private Adopter adopter;
    private Animal dog;
    private Vet vet;


    public Game(Adopter adopter, Animal dog, Vet vet) {
        this.adopter = adopter;
        this.dog = dog;
        this.vet = vet;
    }


    public Adopter getAdopter() {
        return adopter;
    }

    public Animal getDog1() {
        return dog;
    }

    public Vet getVet() {
        return vet;
    }

    public void setAdopter(Adopter adopter) {
        this.adopter = adopter;
    }

    public void setDog1(Animal dog) {
        this.dog = dog;
    }

    public void setVet(Vet vet) {
        this.vet = vet;
    }
}
