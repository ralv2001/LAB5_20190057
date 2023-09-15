package com.example.clase4gtics.repository;

import com.example.clase4gtics.entity.Lugares;
import com.example.clase4gtics.entity.OrderDetails;
import com.example.clase4gtics.entity.OrderDetailsId;
import com.example.clase4gtics.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LugaresRepository extends JpaRepository<Lugares, Integer>{
}



