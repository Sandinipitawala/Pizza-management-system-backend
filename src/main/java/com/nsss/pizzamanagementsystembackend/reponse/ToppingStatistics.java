package com.nsss.pizzamanagementsystembackend.reponse;

//ADDED TOPPING STATISTICS
public class ToppingStatistics {
    private String toppingId;
    private String toppingName;
    private double smallOrders;
    private double mediumOrders;
    private double largeOrders;
    private double totalOrders;

    public ToppingStatistics(String toppingId, String toppingName, double smallOrders, double mediumOrders, double largeOrders, double totalOrders) {
        this.toppingId = toppingId;
        this.toppingName = toppingName;
        this.smallOrders = smallOrders;
        this.mediumOrders = mediumOrders;
        this.largeOrders = largeOrders;
        this.totalOrders = totalOrders;
    }

    public String getToppingId() {
        return toppingId;
    }

    public void setToppingId(String toppingId) {
        this.toppingId = toppingId;
    }

    public String getToppingName() {
        return toppingName;
    }

    public void setToppingName(String toppingName) {
        this.toppingName = toppingName;
    }

    public double getSmallOrders() {
        return smallOrders;
    }

    public void setSmallOrders(double smallOrders) {
        this.smallOrders = smallOrders;
    }

    public double getMediumOrders() {
        return mediumOrders;
    }

    public void setMediumOrders(double mediumOrders) {
        this.mediumOrders = mediumOrders;
    }

    public double getLargeOrders() {
        return largeOrders;
    }

    public void setLargeOrders(double largeOrders) {
        this.largeOrders = largeOrders;
    }

    public double getTotalOrders() {
        return totalOrders;
    }

    public void setTotalOrders(double totalOrders) {
        this.totalOrders = totalOrders;
    }
}
