package com.example.clase4gtics.repository;

import com.example.clase4gtics.entity.OrderDetails;
import com.example.clase4gtics.entity.OrderDetailsId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDetailsRepository extends JpaRepository<OrderDetails, OrderDetailsId> {
}
