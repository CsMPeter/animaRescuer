package org.fasttrackit;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Game {
    private Adopter adopter;
    private Animal animal;
    private Vet vet;
    private List<AnimalFood> availableFood = new ArrayList<>();
    private List<Recreation> availableActivities = new ArrayList<>();


    public Game(Adopter adopter, Animal dog, Vet vet) {
        this.adopter = adopter;
        this.animal = animal;
        this.vet = vet;
    }


    public Adopter getAdopter() {
        return adopter;
    }

    public Animal getDog1() {
        return animal;
    }

    public Vet getVet() {
        return vet;
    }

    public void setAdopter(Adopter adopter) {
        this.adopter = adopter;
    }

    public void setDog1(Animal dog) {
        this.animal = animal;
    }

    public void setVet(Vet vet) {
        this.vet = vet;

    }

    public void start() {


        initFood();
        initActivity();
        initAnimal();
        initRescuer();
        nameAnimal();
        int feeding, playing;
        for(int i = 0;i < 10; i++) {

            if (animal.getAppetite() == 10) {
                System.out.println("Your animal died of starvation :(");
                break;
            }

            System.out.println("Would you like to feed your animal?(0 = yes, 1 = no)");
            Scanner scanner = new Scanner(System.in);
            feeding = scanner.nextInt();
            while (feeding > 1)
            {
                System.out.println("Enter a valid number!");
                feeding = scanner.nextInt();
            }
            if (feeding == 0) {
                requireFeeding();
            } else
                animal.setAppetite(animal.getAppetite() + 1);

            System.out.println("Would you like to play with your animal?(0 = yes, 1 = no)");
            playing = scanner.nextInt();
            while(playing > 1)
            {
                System.out.println("Enter a valid number!");
                playing = scanner.nextInt();
            }
            if (playing == 0) {
                requireActivity();
            } else
                animal.setHappiness(animal.getHappiness() - 1);




        }
        if(animal.getAppetite() > 6 && animal.getHappiness() > 6)
            System.out.println("Your animal remained hungry, but it's happy that you played with it. Feed it more next time!");
        else
            if(animal.getAppetite() < 6 && animal.getHappiness() > 6)
            System.out.println("Your animal is fed and it's happy that you played with it. You are the MVP!");
            else
                if(animal.getAppetite() > 6 && animal.getHappiness() < 6)
                    System.out.println("Your animal remained hungry and it's sad because you didn't spent enough time with it. Ty better next time!");
                else
                 if(animal.getAppetite() < 6 && animal.getHappiness() < 6)
                     System.out.println("Your animal is fed but it's sad because you didn't spent enough time with it. Spend more time with it next time!");




    }

    Date expDate = new Date(2020, 10, 9);

    private void initFood() {

        AnimalFood royalCanin = new AnimalFood("Royal Canin", 40, 300, expDate, true);
        AnimalFood pedigree = new AnimalFood("Pedigree", 30, 100, expDate, true);
        AnimalFood purina = new AnimalFood("Purina", 50, 150, expDate, true);

        availableFood.add(royalCanin);
        availableFood.add(pedigree);
        availableFood.add(purina);


    }

    private void initActivity() {

        Recreation running = new Recreation("Running", 10);
        Recreation frisbee = new Recreation("Frisbee catching", 15);
        Recreation sleeping = new Recreation("Sleeping", 20);

        availableActivities.add(running);
        availableActivities.add(frisbee);
        availableActivities.add(sleeping);


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

        int chosenAnimal;
        System.out.println("Choose animal type Dog or Cat(0/1): ");
        Scanner scanner = new Scanner(System.in);
        try {
            chosenAnimal = scanner.nextInt();
            if (chosenAnimal == 0) {
                animal = new Dog();
                animal.setHappiness(0);
                animal.setAppetite(9);
                animal.setAge(3);
                animal.setFavouriteFood(availableFood.get(0));
                animal.setHealthiness(6);
                animal.setSex("Male");
                animal.setWeight(10);
                animal.setRecreation(availableActivities.get(0));

                System.out.println("You selected a dog which is " + animal.getAge() + " years old, its weight is " + animal.getWeight() + "kg, its a " + animal.getSex() +
                        " it really likes eating " + animal.getFavouriteFood().getFoodName() + " and loves " + animal.getRecreation().getRecreationName());

            } else if (chosenAnimal == 1) {
                animal = new Cat();
                animal.setHappiness(0);
                animal.setAppetite(9);
                animal.setRecreation(availableActivities.get(2));
                animal.setWeight(3);
                animal.setSex("Female");
                animal.setHealthiness(7);
                animal.setFavouriteFood(availableFood.get(1));
                animal.setAge(2);

                System.out.println("You selected a cat which is " + animal.getAge() + " years old, its weight is " + animal.getWeight() + "kg, its a" + animal.getSex() +
                        " it really likes eating " + animal.getFavouriteFood().getFoodName() + "and loves " + animal.getRecreation().getRecreationName());

            }
            else{
                System.out.println("Please choose from the given numbers!");
                initAnimal();
            }
        }catch (InputMismatchException e){
            System.out.println("Invalid datatype.");
            initAnimal();
        }


    }


    private void initRescuer() {
        String userName;
        adopter = new Adopter();
        System.out.println("Enter your name:");
        Scanner scanner = new Scanner(System.in);

         Pattern usrNamePtrn = Pattern.compile("^[a-zA-Z_-]{0,14}$");
            userName = scanner.next();
            Matcher mtch = usrNamePtrn.matcher(userName);
            if(mtch.matches()){

                adopter.setAdopterName(userName);
                System.out.println("Thanks for saving animals " + adopter.getAdopterName() + " :) ");
            }else{
            System.out.println("Invalid data type.");
            initRescuer();}
        }




    private void nameAnimal() {
        String givenAnimalName;
        System.out.println("Give the Animal a name: ");
        Scanner scanner = new Scanner(System.in);

        Pattern usrNamePtrn = Pattern.compile("^[a-zA-Z_-]{0,14}$");
        givenAnimalName = scanner.next();

        Matcher mtch = usrNamePtrn.matcher(givenAnimalName);

        if(mtch.matches()){

            animal.setName(givenAnimalName);
        }else{
        System.out.println("Invalid data type.");
       nameAnimal();}


    }

    private void requireFeeding() {
        int chosenFood;
        System.out.println("Available foods: ");
        displayFood();
        System.out.println("Choose one please(0/1/2): ");
        Scanner scanner = new Scanner(System.in);
        try {
            chosenFood = scanner.nextInt();
            adopter.Feed(animal, availableFood.get(chosenFood));
            System.out.println("");
        }catch (InputMismatchException e){
            System.out.println("Invalid data type.");
            requireFeeding();
        }

    }

    private void requireActivity() {
        int chosenActivity;
        System.out.println("Available recreations: ");
        displayActivity();
        System.out.println("Choose one please(0/1/2): ");
        Scanner scanner = new Scanner(System.in);
        try{
        chosenActivity = scanner.nextInt();
        adopter.recreate(animal, adopter, availableActivities.get(chosenActivity));
        System.out.println("");
        }catch (InputMismatchException e){
            System.out.println("Invalid data type.");
            requireActivity();
        }
    }

}
