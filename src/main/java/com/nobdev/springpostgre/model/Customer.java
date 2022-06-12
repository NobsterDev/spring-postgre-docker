package com.nobdev.springpostgre.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long customerID;

    @Column(columnDefinition = "varchar(50) NOT NULL")
    private String nameString;

    @Column(columnDefinition = "varchar(500) NOT NULL")
    private String descriptionString;

    public Customer() {

    }

    public Customer(Long customerID, String nameString, String descriptionString) {
        this.customerID = customerID;
        this.nameString = nameString;
        this.descriptionString = descriptionString;
    }

    public Long getCustomerID() {
        return this.customerID;
    }

    public void setCustomerID(Long customerID) {
        this.customerID = customerID;
    }

    public String getNameString() {
        return this.nameString;
    }

    public void setNameString(String nameString) {
        this.nameString = nameString;
    }

    public String getDescriptionString() {
        return this.descriptionString;
    }

    public void setDescriptionString(String descriptionString) {
        this.descriptionString = descriptionString;
    }
}
