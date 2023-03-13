package com.ijse.ecommerceapp.entity;

import javax.persistence.*;

@Entity
@Table(name = "customer")
public class User {
    @Id
    @Column(name = "user_id")
    private String propertyId;
    @Column(name = "user_number")
    private String contactNumber;
    @Column(name = "user_name")
    private String name;
    @Column(name = "user_email", unique = true)
    private String email;
    @Column(name = "user_password", unique = true)
    private String password;
    @Column(name = "nic", unique = true)
    private String nic;

    public User() {
    }

    public User(String propertyId, String contactNumber, String name, String email, String password, String nic) {
        this.propertyId = propertyId;
        this.contactNumber = contactNumber;
        this.name = name;
        this.email = email;
        this.password = password;
        this.nic = nic;
    }

    public String getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(String propertyId) {
        this.propertyId = propertyId;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    @Override
    public String toString() {
        return "User{" +
                "propertyId='" + propertyId + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", nic='" + nic + '\'' +
                '}';
    }
}
