package com.pe.killa.products.infraestructure.crud;

import com.pe.killa.products.domain.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface IProductCrudRepository extends CrudRepository<Product, Long> {
}
