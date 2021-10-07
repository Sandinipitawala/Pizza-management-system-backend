package com.nsss.pizzamanagementsystembackend.model;

public class OrderItem {
    private String crust;
    private String topping;
    private String size;
    private int quantity;
    private double unitPrice;
    private double total;

    public OrderItem() {
    }

    public OrderItem(String crust, String topping, String size, int quantity, double unitPrice) {
        this.crust = crust;
        this.topping = topping;
        this.size = size;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public String getCrust() {
        return crust;
    }

    public void setCrust(String crust) {
        this.crust = crust;
    }

    public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
