package org.fasttrackit;

public class Recreation {
   private String recreationName;
   private int durationMin;

    public Recreation(String recreationName, int durationMin) {
        this.recreationName = recreationName;
        this.durationMin = durationMin;
    }

    public Recreation(){}

    public String getRecreationName() {
        return recreationName;
    }

    public int getDurationMin() {
        return durationMin;
    }

    public void setRecreationName(String recreationName) {
        this.recreationName = recreationName;
    }

    public void setDurationMin(int durationMin) {
        this.durationMin = durationMin;
    }
}
