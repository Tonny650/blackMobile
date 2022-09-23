package com.thisname.blackmobile.repository;

import com.thisname.blackmobile.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //repositorio del producto que extiende de jpa
public interface IProductRepository extends JpaRepository<Product,Integer> {

}
