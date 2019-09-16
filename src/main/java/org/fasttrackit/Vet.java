package org.fasttrackit;

public class Vet {
   private String vetName;
   private String specialization;
   private int experience;//in years

    public Vet(String vetName, String specialization, int experience) {
        this.vetName = vetName;
        this.specialization = specialization;
        this.experience = experience;
    }

    public String getVetName() {
        return vetName;
    }

    public String getSpecialization() {
        return specialization;
    }

    public int getExperience() {
        return experience;
    }

    public void setVetName(String vetName) {
        this.vetName = vetName;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
