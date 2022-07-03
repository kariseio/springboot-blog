package com.kariseio.project.data.dao;

import com.kariseio.project.data.entity.ProductEntity;

public interface ProductDAO {
    ProductEntity saveProduct(ProductEntity productEntity);

    ProductEntity getProduct(String productId);
}
