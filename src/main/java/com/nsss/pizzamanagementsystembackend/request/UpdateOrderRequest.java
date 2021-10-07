package com.nsss.pizzamanagementsystembackend.request;

public class UpdateOrderRequest {
    private String customerName;
    private String address;


    public UpdateOrderRequest(String customerName, String address) {
        this.customerName = customerName;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}
