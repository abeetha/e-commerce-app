package com.ijse.ecommerceapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Orders {
    @Id
    @Column(name = "property_id")
    private String propertyId;

    private double totalCost;

    @Column(name = "order_qty")
    private int orderQty;

    public Orders() {
    }

    public Orders(String propertyId, double totalCost, int orderQty) {
        this.propertyId = propertyId;
        this.totalCost = totalCost;
        this.orderQty = orderQty;
    }

    public String getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(String propertyId) {
        this.propertyId = propertyId;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public int getOrderQty() {
        return orderQty;
    }

    public void setOrderQty(int orderQty) {
        this.orderQty = orderQty;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "propertyId='" + propertyId + '\'' +
                ", totalCost=" + totalCost +
                ", orderQty=" + orderQty +
                '}';
    }
}
