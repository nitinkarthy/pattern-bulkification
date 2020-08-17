package com.nitkart.domain.mock_entities;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Builder
@Data
public class Customer {
    private Long id;
    private String name;
    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order o){
        this.orders.add(o);
    }
}
