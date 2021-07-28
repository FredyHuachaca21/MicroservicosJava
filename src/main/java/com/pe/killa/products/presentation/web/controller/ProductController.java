package com.pe.killa.products.presentation.web.controller;

import com.pe.killa.products.application.mainmodule.dto.ProductDto;
import com.pe.killa.products.application.mainmodule.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/apiProducts")
public class ProductController {

    @Autowired
    private IProductService service;

    @GetMapping("/listar")
    public List<ProductDto> listarTodo(){
        return service.getAll();
    }

    @GetMapping("/{productId}")
    public ProductDto listarPorId(@PathVariable("productId") long productId){
        return service.getProduct(productId).get();
    }

}
