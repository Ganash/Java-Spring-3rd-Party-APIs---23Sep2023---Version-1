package dev.ganesh.productServicettsevening.services;

import dev.ganesh.productServicettsevening.dtos.ProductDto;
import org.springframework.web.bind.annotation.*;

public interface ProductService {

    String getAllProducts();


    String getSingleProduct(Long productId);


    String addNewProduct(ProductDto productDto);


    String updateProduct(Long productId);


    String deleteProduct(Long productId);
}
