package com.pe.killa.products.application.mainmodule.mapper;


import com.pe.killa.products.application.mainmodule.dto.ProductDto;
import com.pe.killa.products.domain.entity.Product;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IProductMapper {

    @Mappings({
            @Mapping(source = "id", target = "productId"),
            @Mapping(source = "description", target = "description"),
            @Mapping(source = "price", target = "price")
    })
    ProductDto toProductDto(Product product);

    List<ProductDto> toProductsDto(List<Product> products);

    @InheritInverseConfiguration
    @Mappings({
            @Mapping(target = "createAt", ignore = true)
    })
    Product toProduct(ProductDto productDto);
}
