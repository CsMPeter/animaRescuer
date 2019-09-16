package org.fasttrackit;

import java.util.Date;

public class AnimalFood {
    private String foodName;
    private float price;
    private float quantity;
    private Date expirationDate;
    private boolean onStock;

    public AnimalFood(String foodName, float price, float quantity, Date expirationDate, boolean onStock) {
        this.foodName = foodName;
        this.price = price;
        this.quantity = quantity;
        this.expirationDate = expirationDate;
        this.onStock = onStock;
    }

    public String getFoodName() {
        return foodName;
    }

    public float getPrice() {
        return price;
    }

    public float getQuantity() {
        return quantity;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public boolean isOnStock() {
        return onStock;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public void setOnStock(boolean onStock) {
        this.onStock = onStock;
    }
}
