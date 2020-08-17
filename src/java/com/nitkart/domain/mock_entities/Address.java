package com.nitkart.domain.mock_entities;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Address {
    private Long id;
    private String building;
    private String street;
    private String city;
    private String state;
    private Integer pinCode;
}
