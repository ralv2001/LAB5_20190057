package com.example.clase4gtics.entity;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "Shippers")
public class Shipper {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "shipperid")
    private int shipperId;
    @Column(name = "companyname", nullable = false)
    private String companyName;
    private String phone;

}
