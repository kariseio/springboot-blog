package com.kariseio.project.data.dao.impl;

import com.kariseio.project.data.dao.ProductDAO;
import com.kariseio.project.data.entity.ProductEntity;
import com.kariseio.project.data.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductDAOImpl implements ProductDAO {
    ProductRepository productRepository;

    @Autowired
    public ProductDAOImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public ProductEntity saveProduct(ProductEntity productEntity) {
        productRepository.save(productEntity);
        return productEntity;
    }

    @Override
    public ProductEntity getProduct(String productId) {
        ProductEntity productEntity = productRepository.getReferenceById(productId);
        return productEntity;
    }
}
