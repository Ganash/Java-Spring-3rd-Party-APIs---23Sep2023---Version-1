package dev.ganesh.productServicettsevening.services;

import dev.ganesh.productServicettsevening.dtos.ProductDto;
import dev.ganesh.productServicettsevening.models.Product;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class FakeStoreProductServiceImpl implements ProductService {

    private RestTemplateBuilder restTemplateBuilder;

    public FakeStoreProductServiceImpl(RestTemplateBuilder restTemplateBuilder){

        // using dependency injection, to get an object of restTemplateBuilder
        this.restTemplateBuilder = restTemplateBuilder;
    }

    @Override
    public List<Product> getAllProducts() {

        // I need to call third party API
        // I will implement getAllProducts at the end
        // when we are using third party API, we are not able to call List

        return null;
    }

    @Override
    public Product getSingleProduct(Long productId) {

        // In getSingleProduct, we will make another call to FakeStoreAPI and get the output.

        // RestTemplateBuilder will allow us to create an object of RestTemplate.

        // restTemplate can make delete, get, head, post, patch, put requests.

        RestTemplate restTemplate = restTemplateBuilder.build();
        ResponseEntity<ProductDto> response = restTemplate.getForEntity("https://fakestoreapi.com/products/{id}", ProductDto.class, productId);

        //     restTemplate.getForEntity("https://fakestoreapi.com/products/{id}", ProductDto.class, productId); - going to return the object of ProductDTO.class

        // so the return type should be ResponseEntity<ProductDTO> response

        return null;
    }

    @Override
    public Product addNewProduct(Product product) {
        return null;
    }

    @Override
    public Product updateProduct(Long productId, Product product) {
        return null;
    }

    @Override
    public Boolean deleteProduct(Long productId) {
        return null;
    }
}
