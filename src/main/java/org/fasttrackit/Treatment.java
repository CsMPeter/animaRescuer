package org.fasttrackit;

import java.util.Date;

public class Treatment {

   private Vet vet;
   private Animal animal;
   private Date treatmentDate;
   private String treatmentResult;

    public Treatment(Vet vet, Animal animal, Date treatmentDate, String treatmentResult) {
        this.vet = vet;
        this.animal = animal;
        this.treatmentDate = treatmentDate;
        this.treatmentResult = treatmentResult;
    }

    public Vet getVet() {
        return vet;
    }

    public Animal getAnimal() {
        return animal;
    }

    public Date getTreatmentDate() {
        return treatmentDate;
    }

    public String getTreatmentResult() {
        return treatmentResult;
    }

    public void setVet(Vet vet) {
        this.vet = vet;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public void setTreatmentDate(Date treatmentDate) {
        this.treatmentDate = treatmentDate;
    }

    public void setTreatmentResult(String treatmentResult) {
        this.treatmentResult = treatmentResult;
    }
}
