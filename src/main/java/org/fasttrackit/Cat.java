package org.fasttrackit;

public class Cat extends Animal {

    private boolean catPureBlooded;
    private String catSpecies;


    public Cat(Animal animal, boolean pureBlooded, String catSpecies) {
        super(animal.getName(), animal.getAge(), animal.getHealthiness(), animal.getAppetite(), animal.getHappiness(), animal.getFavouriteFood()
                , animal.getRecreation(), animal.getWeight(), animal.getSex());
        this.catPureBlooded = catPureBlooded;
        this.catSpecies = catSpecies;
    }

    public Cat(){}


    @Override
    public void print() {
        super.print();
        System.out.println(this.catPureBlooded + this.catSpecies);
    }

    public boolean isPureBlooded() {

        return catPureBlooded;
    }

    public void setCatPureBlooded(boolean catPureBlooded) {

        this.catPureBlooded = catPureBlooded;
    }

    public void setCatSpecies(String catSpecies) {
        this.catSpecies = catSpecies;
    }

    public String getCatSpecies() {
        return catSpecies;
    }

    @Override
    public void stateOfHappiness() {
        if (getHappiness() > 5)
            System.out.println(getName() + " is happy and curring");
        else
            System.out.println(getName() + " is sad.");
    }
}



