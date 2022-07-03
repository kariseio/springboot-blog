package com.kariseio.project.data.entity;

import com.kariseio.project.data.dto.ProductDto;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "product") // 테이블 자동 생성
public class ProductEntity {
    @Id // PK
    String productId;

    String productName;

    Integer productPrice;

    Integer productStack;

    public ProductDto toDto() {
        return ProductDto.builder()
                .productId(productId)
                .productName(productName)
                .productPrice(productPrice)
                .productStack(productStack)
                .build();
    }
}
