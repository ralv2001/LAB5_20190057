package com.example.clase4gtics.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "`order details`")
@Getter
@Setter
public class OrderDetails {

    @EmbeddedId
    private OrderDetailsId id;

    @ManyToOne
    @JoinColumn(name = "OrderID")
    @MapsId("orderID")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "ProductID")
    @MapsId("productID")
    private Product product;

    @Column(name = "UnitPrice")
    private BigDecimal unitPrice;

    @Column(name = "Quantity")
    private int quantity;

    @Column(name = "Discount")
    private double discount;

}
