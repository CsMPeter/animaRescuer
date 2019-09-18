package org.fasttrackit;

import java.util.Date;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Recreation catRecreation = new Recreation("Nap",20);

        Recreation dogRecreation = new Recreation("Stick catching",30);

        Date expDate = new Date(2020,10,9);

        AnimalFood catFood = new AnimalFood("Frisky",50,20,expDate,true);

        AnimalFood dogFood = new AnimalFood("Pedigree",60,70,expDate,true);

        Animal cat = new Animal("Kitty",2,9,8,10,catFood,catRecreation,3.21,"Male");

        Animal dog = new Animal("Lassie",3,6,7,6,dogFood,dogRecreation,15,"Female");

        Adopter adopter1 = new Adopter("John",2000);

        Vet vet1 = new Vet("Michael","Cardiology",5);

        Game game = new Game(adopter1,dog,vet1);

        Dog dog1 = new Dog(dog,true,"Labrador");

        Cat cat1 = new Cat(cat,false,"Mixed");

        dog1.stateOfHappiness();

//         dog.print();
//
//
//       adopter1.Feed(dog,dogFood);
//
//       dog.print();








    }
}
