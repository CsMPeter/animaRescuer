package org.fasttrackit;


public class Animal {
   private String name;
   private int age;
   private int healthiness;
   private int appetite;
   private int happiness;
   private AnimalFood favouriteFood;
   private Recreation recreation;
   private double weight;
   private String sex;

    public Animal(String name, int age, int healthiness, int appetite, int happiness, AnimalFood favouriteFood, Recreation recreation, double weight, String sex) {

        this.age = age;
        this.healthiness = healthiness;
        this.appetite = appetite;
        this.happiness = happiness;
        this.favouriteFood = favouriteFood;
        this.recreation = recreation;
        this.weight = weight;
        this.sex = sex;
        this.name = name;
    }



    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHealthiness() {
        return healthiness;
    }

    public int getAppetite() {
        return appetite;
    }

    public int getHappiness() {
        return happiness;
    }

    public AnimalFood getFavouriteFood() {
        return favouriteFood;
    }

    public Recreation getRecreation() {
        return recreation;
    }

    public double getWeight() {
        return weight;
    }

    public String getSex() {
        return sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHealthiness(int healthiness) {
        this.healthiness = healthiness;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }

    public void setFavouriteFood(AnimalFood favouriteFood) {
        this.favouriteFood = favouriteFood;
    }

    public void setRecreation(Recreation recreation) {
        this.recreation = recreation;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void print(){

        System.out.println("Name: "+ this.name + " age: " + this.age + " healthiness: " + this.healthiness + " appetite: " + this.appetite + " happiness: "
                + this.happiness + " favFood: " + this.favouriteFood.getFoodName() + " weight: " + this.weight +
                " sex: " + this.sex + " recreation: " + this.recreation.getRecreationName());

    }
}
