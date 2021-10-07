package com.nsss.pizzamanagementsystembackend.reponse;

//Crust Statistics
public class CrustStatistics {
    private String crustId;
    private String crustName;
    private double smallOrders;
    private double mediumOrders;
    private double largeOrders;
    private double totalOrders;

    public CrustStatistics(String crustId, String crustName, double smallOrders, double mediumOrders, double largeOrders, double totalOrders) {
        this.crustId = crustId;
        this.crustName = crustName;
        this.smallOrders = smallOrders;
        this.mediumOrders = mediumOrders;
        this.largeOrders = largeOrders;
        this.totalOrders = totalOrders;
    }

    public String getCrustId() {
        return crustId;
    }

    public void setCrustId(String crustId) {
        this.crustId = crustId;
    }

    public String getCrustName() {
        return crustName;
    }

    public void setCrustName(String crustName) {
        this.crustName = crustName;
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
