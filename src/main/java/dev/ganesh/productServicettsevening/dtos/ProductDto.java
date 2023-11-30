package dev.ganesh.productServicettsevening.dtos;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ProductDto {

    String title;
    double price;
    String  description;
    String image;
    String category;
}
