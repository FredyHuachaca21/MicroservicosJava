package com.pe.killa.products.infraestructure.repository;


import com.pe.killa.products.application.mainmodule.dto.ProductDto;
import com.pe.killa.products.application.mainmodule.mapper.IProductMapper;
import com.pe.killa.products.domain.entity.Product;
import com.pe.killa.products.domain.repository.IProductRepository;
import com.pe.killa.products.infraestructure.crud.IProductCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public class ProductRepository implements IProductRepository {

    @Autowired
    private IProductCrudRepository productCrudRepository;

    @Autowired
    private IProductMapper productMapper;

    public List<ProductDto> getAll(){
        List<Product> products = (List<Product>)productCrudRepository.findAll();
        return productMapper.toProductsDto(products);
    }

    public Optional<ProductDto> getProduct(long id){

        /*POSIBLES RETORNOS*/
        /*Product product = productCrudRepository.findById(id).get();
        return Optional.ofNullable(productMapper.toProductDto(product));*/

        //Opcion viable
        //return productCrudRepository.findById(id).map(product -> productMapper.toProductDto(product));

        //La Mejor opcion
        return productCrudRepository.findById(id).map(productMapper::toProductDto);
    }
}
