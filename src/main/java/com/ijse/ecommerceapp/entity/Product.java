package com.ijse.ecommerceapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @Column(name = "property_id")
    private String propertyId;

    @Column(name = "display_name")
    private String displayName;

    private String description;

    @Column(name = "unit_price")
    private double unitPrice;

    private int qty;

    public Product() {
    }

    public Product(String propertyId, String displayName, String description, double unitPrice, int qty) {
        this.propertyId = propertyId;
        this.displayName = displayName;
        this.description = description;
        this.unitPrice = unitPrice;
        this.qty = qty;
    }

    public String getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(String propertyId) {
        this.propertyId = propertyId;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Product{" +
                "propertyId='" + propertyId + '\'' +
                ", displayName='" + displayName + '\'' +
                ", description='" + description + '\'' +
                ", unitPrice=" + unitPrice +
                ", qty=" + qty +
                '}';
    }
}
