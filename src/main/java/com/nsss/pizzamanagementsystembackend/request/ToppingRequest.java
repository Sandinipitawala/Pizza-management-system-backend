package com.nsss.pizzamanagementsystembackend.request;

public class ToppingRequest {
    private String name;
    private double smallPrice;
    private boolean vegan;

    public ToppingRequest(String name, double smallPrice, boolean vegan) {
        this.name = name;
        this.smallPrice = smallPrice;
        this.vegan = vegan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSmallPrice() {
        return smallPrice;
    }

    public void setSmallPrice(double smallPrice) {
        this.smallPrice = smallPrice;
    }

    public boolean isVegan() {
        return vegan;
    }

    public void setVegan(boolean vegan) {
        this.vegan = vegan;
    }
}