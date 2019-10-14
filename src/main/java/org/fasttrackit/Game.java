package org.fasttrackit;

import java.util.*;

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

        initAnimal();
        initRescuer();
        nameAnimal();
        requireFeeding();


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

        for (int i = 0; i < activityCount; i++) {

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

    private void displayActivity() {

        for (Recreation Recreatioin : availableActivities) {
            System.out.println(Recreatioin.getRecreationName());

        }

    }

    private void initAnimal() {

        String AnimalName;
        dog = new Dog();
        System.out.println("Enter Animals name: ");
        Scanner scanner = new Scanner(System.in);
        try{
            AnimalName = scanner.next();
            dog.setName(AnimalName);
        }catch(InputMismatchException e){
            System.out.println("Invalid data type.");
            initAnimal();
        }

    }

    private void initRescuer() {
        String userName;
        adopter = new Adopter();
        System.out.println("Enter name:");
        Scanner scanner = new Scanner(System.in);
        try {
            userName = scanner.next();
            adopter.setAdopterName(userName);
        } catch (InputMismatchException e) {
            System.out.println("Invalid data type.");
            initRescuer();
        }

    }

    private void nameAnimal() {
        String givenAnimalName;
        System.out.println("Give the Animal a name: ");
        Scanner scanner = new Scanner(System.in);
        givenAnimalName = scanner.next();
        dog.setName(givenAnimalName);

    }

    private void requireFeeding(){
        System.out.println("Please feed your animal!");
        System.out.println("Available foods: ");
        displayFood();
        System.out.println("");
    }

}
