package com.ijse.ecommerceapp.dto.request;

public class RequestUpdateUserDTO {
    private String propertyId;
    private String contactNumber;
    private String name;
    private String email;
    private String password;

    public RequestUpdateUserDTO() {
    }

    public RequestUpdateUserDTO(String propertyId, String contactNumber, String name, String email, String password) {
        this.propertyId = propertyId;
        this.contactNumber = contactNumber;
        this.name = name;
        this.email = email;
        this.password = password;
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

    @Override
    public String toString() {
        return "RequestUpdateUserDTO{" +
                "propertyId='" + propertyId + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
