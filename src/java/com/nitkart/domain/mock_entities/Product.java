package com.nitkart.domain.mock_entities;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Product {
    private Long id;
    private String name;
    private Float unitPrice;
}
