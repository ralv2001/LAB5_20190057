package com.example.clase4gtics.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @Column(name = "CustomerID", nullable = false, length = 5)
    private String customerID;

    @Column(name = "CompanyName", nullable = false, length = 40)
    private String companyName;

    @Column(name = "ContactName", length = 30)
    private String contactName;

    @Column(name = "ContactTitle", length = 30)
    private String contactTitle;

    @Column(name = "Address", length = 60)
    private String address;

    @Column(name = "City", length = 15)
    private String city;

    @Column(name = "Region", length = 15)
    private String region;

    @Column(name = "PostalCode", length = 10)
    private String postalCode;

    @Column(name = "Country", length = 15)
    private String country;

    @Column(name = "Phone", length = 24)
    private String phone;

    @Column(name = "Fax", length = 24)
    private String fax;

}