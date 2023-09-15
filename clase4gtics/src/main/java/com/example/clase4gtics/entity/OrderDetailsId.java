package com.example.clase4gtics.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Embeddable
@Getter
@Setter
public class OrderDetailsId implements Serializable {

    @Column(name = "OrderID")
    private Integer orderID;

    @Column(name = "ProductID")
    private Integer productID;
}
