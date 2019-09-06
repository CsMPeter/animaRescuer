package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Animal cat = new Animal();
        Adopter adopter1 = new Adopter();
        AnimalFood food = new AnimalFood();
        Game game = new Game();
        Recreation recreation = new Recreation();
        Vet vet1 = new Vet();
        cat.name = "Kitty";
        cat.age = 2;
        cat.healthiness = 9;
        cat.appetite = 8;
        cat.favouriteFood.foodName = "Frisky";
        cat.happiness = 10;
        adopter1.adopterName = "John";
        adopter1.funds = 2000;
        food.expirationDate = 2007-12-03;
        food.foodName = "Frisky";
        food.onStock = true;
        food.price = 20;
        food.quantity = 1000;
        recreation.recreationName = "Ball";
    }
}
