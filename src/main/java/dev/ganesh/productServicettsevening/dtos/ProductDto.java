package dev.ganesh.productServicettsevening.dtos;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ProductDto {

    private Long id;
    private String ttle;
    private double price;
    private String  description;
    private String image;
    private String category;
}
