package org.fasttrackit;

public class Dog extends Animal{

    private boolean dogPureBlooded;
    private String dogSpecies;

    public Dog(Animal animal, boolean pureBlooded, String dogSpecies) {
        super(animal.getName(),animal.getAge(),animal.getHealthiness(),animal.getAppetite(),animal.getHappiness(),animal.getFavouriteFood()
                ,animal.getRecreation(),animal.getWeight(),animal.getSex());
        this.dogPureBlooded = dogPureBlooded;
        this.dogSpecies = dogSpecies;
    }

    public Dog (){

    }

    @Override
    public void print() {
        super.print();
        System.out.println(this.dogPureBlooded + this.dogSpecies);
    }

    public boolean isPureBlooded() {

        return dogPureBlooded;
    }

    public boolean isDogPureBlooded() {
        return dogPureBlooded;
    }

    public String getDogSpecies() {
        return dogSpecies;
    }

    public void setDogPureBlooded(boolean dogPureBlooded) {
        this.dogPureBlooded = dogPureBlooded;
    }

    public void setDogSpecies(String dogSpecies) {
        this.dogSpecies = dogSpecies;
    }

    @Override
    public void stateOfHappiness() {
        if(getHappiness() > 5)
            System.out.println(getName() + " is happy and shaking its tail.");
        else
            System.out.println(getName() + " is sad.");
    }
}

