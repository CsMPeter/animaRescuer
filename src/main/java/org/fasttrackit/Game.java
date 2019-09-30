package org.fasttrackit;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.util.Scanner;

public class Game {
    private Adopter adopter;
    private Animal dog;
    private Vet vet;
    private List<AnimalFood> availableFood = new ArrayList<>();
    private List<Recreation> availableActivities = new ArrayList<>();



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

    public void start() {

        initFood();
        initActivity();
        System.out.println("Available food.\n");
        displayFood();
        System.out.println("Available activities.\n");
        displayActivity();


    }

    Date expDate = new Date(2020, 10, 9);

    private void initFood() {

        int foodCount = getFoodCountFromUser();

        for (int i = 0; i < foodCount; i++) {
            AnimalFood food = new AnimalFood("Royal Canin" + i, 40, 300, expDate, true);

            availableFood.add(food);
        }


    }

    private void initActivity() {

        int activityCount = getActivityCountFromUser();

        for(int i=0;i<activityCount;i++) {

            Recreation activity = new Recreation("Running" + i, 20);


            availableActivities.add(activity);
        }


    }

    private int getFoodCountFromUser() {

        System.out.println("Please enter number of food: ");
        int count;

        Scanner scanner = new Scanner(System.in);
        count = scanner.nextInt();

        return count;

    }

    private int getActivityCountFromUser() {

        System.out.println("Please enter number of activities: ");
        int count;

        Scanner scanner = new Scanner(System.in);
        count = scanner.nextInt();

        return count;

    }


    private void displayFood() {



        for (AnimalFood AnimalFood : availableFood)
            System.out.println(AnimalFood.getFoodName());

    }

    private void displayActivity(){

        for(Recreation Recreatioin : availableActivities){
            System.out.println(Recreatioin.getRecreationName());

        }

    }

}
