package com.pe.killa.products.infraestructure.crud;

import com.pe.killa.products.domain.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductCrudRepository extends JpaRepository<Product, Long> {
}
