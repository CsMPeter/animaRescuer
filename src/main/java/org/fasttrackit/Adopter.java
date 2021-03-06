package org.fasttrackit;

public class Adopter {
    private String adopterName;
    private float funds;

    public Adopter(String adopterName, float funds) {
        this.adopterName = adopterName;
        this.funds = funds;
    }

    public Adopter(){}

    public void Feed(Animal animal, AnimalFood food){

        int newAppetite = animal.getAppetite();
        int newHappiness = animal.getHappiness();
        System.out.println(adopterName + " just gave some " + food.getFoodName() + " food to " + animal.getName());

        if (food.getFoodName().equals(animal.getFavouriteFood().getFoodName())){
            animal.setHappiness(newHappiness + 1);
            System.out.println("Favourite food bonus!! New happiness is: " + animal.getHappiness());
        }

        animal.setAppetite(newAppetite - 1);

        System.out.println(animal.getName() + " has " + animal.getAppetite() + " as new appetite.");

    }

    public void recreate(Animal animal,Adopter adopter,Recreation recreation){

        int newHappiness = animal.getHappiness();

        System.out.println(adopterName + " did " + recreation.getRecreationName() + " with " + animal.getName());

        if(recreation.getRecreationName().equals(animal.getRecreation().getRecreationName())){
            animal.setHappiness(newHappiness + 2);
            System.out.println("Favourite activity bonus!!");
        }
        else
            animal.setHappiness(newHappiness + 1);

        System.out.println("New happiness is: " + animal.getHappiness());

    }

    public String getAdopterName() {
        return adopterName;
    }

    public float getFunds() {
        return funds;
    }

    public void setAdopterName(String adopterName) {
        this.adopterName = adopterName;
    }

    public void setFunds(float funds) {
        this.funds = funds;
    }
}
