package com.pe.killa.products.domain.service;

import com.pe.killa.products.application.mainmodule.dto.ProductDto;
import com.pe.killa.products.application.mainmodule.service.IProductService;
import com.pe.killa.products.domain.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService implements IProductService {

    @Autowired
    private IProductRepository productRepository;

    public List<ProductDto> getAll() {
        return productRepository.getAll();
    }

    public Optional<ProductDto> getProduct(long productId) {
        return productRepository.getProduct(productId);
    }
}
