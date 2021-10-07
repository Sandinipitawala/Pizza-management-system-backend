package com.nsss.pizzamanagementsystembackend.request;

public class OrderItemRequest {
    private String crust;
    private String topping;
    private String size;
    private int quantity;

    public OrderItemRequest(String crust, String topping, String size, int quantity) {
        this.crust = crust;
        this.topping = topping;
        this.size = size;
        this.quantity = quantity;
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
}
