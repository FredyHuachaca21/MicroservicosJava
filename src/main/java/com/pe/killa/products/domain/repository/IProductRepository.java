package com.pe.killa.products.domain.repository;

import com.pe.killa.products.application.mainmodule.dto.ProductDto;

import java.util.List;
import java.util.Optional;

public interface IProductRepository {
    List<ProductDto> getAll();
    Optional<ProductDto> getProduct(long productId);
}
