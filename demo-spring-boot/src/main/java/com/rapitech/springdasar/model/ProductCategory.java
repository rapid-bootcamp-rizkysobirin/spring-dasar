package com.rapitech.springdasar.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor //ini digunaan untuk menggunakan constructor
@Data
public class ProductCategory {
    private Product product;
    private Category category;
}
