package org.fasttrackit;

public class Mammals extends  Animal{

   private boolean pureBlooded;

    public Mammals(Animal animal,boolean pureBlooded) {
        super(animal.getName(),animal.getAge(),animal.getHealthiness(),animal.getAppetite(),animal.getHappiness(),animal.getFavouriteFood()
                ,animal.getRecreation(),animal.getWeight(),animal.getSex());
        this.pureBlooded = pureBlooded;
    }


    @Override
    public void print() {
        super.print();
        System.out.println(this.pureBlooded);
    }

    public boolean isPureBlooded() {
        return pureBlooded;
    }

    public void setPureBlooded(boolean pureBlooded) {
        this.pureBlooded = pureBlooded;
    }
}
