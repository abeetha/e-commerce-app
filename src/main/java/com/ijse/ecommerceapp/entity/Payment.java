package com.ijse.ecommerceapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "payment")
public class Payment {
    @Id
    @Column(name = "property_id")
    private String propertyId;
    private double amount;
    private String bank;

    public Payment() {
    }

    public Payment(String propertyId, double amount, String bank) {
        this.propertyId = propertyId;
        this.amount = amount;
        this.bank = bank;
    }

    public String getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(String propertyId) {
        this.propertyId = propertyId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "propertyId='" + propertyId + '\'' +
                ", amount=" + amount +
                ", bank='" + bank + '\'' +
                '}';
    }
}
