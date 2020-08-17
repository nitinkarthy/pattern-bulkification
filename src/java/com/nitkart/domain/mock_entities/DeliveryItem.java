package com.nitkart.domain.mock_entities;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class DeliveryItem {
    private Order order;
    private Product product;
    private Integer Quantity;
    private Address address;

//    public void ddd(){
//        Address.
//    }
}
