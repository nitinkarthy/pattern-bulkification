package com.nitkart.domain.mock_entities;


import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Builder
@Data
public class Order {
    private Long id;
    private Integer totalAmount;
    private List<DeliveryItem> orderItems;
    private Date placedDated;
}
