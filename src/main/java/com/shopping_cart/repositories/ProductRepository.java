package com.shopping_cart.repositories;

import com.shopping_cart.models.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface ProductRepository extends JpaRepository<Product, String> {

    Optional<Product> findProductByName(String name);

    @Query("SELECT p FROM Product p WHERE p.name LIKE CONCAT('%',:keyword,'%')")
    List<Product> findProductByKeyword(String keyword);
}
