package com.nitkart.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class HelloTest {

    @Test
    void first() {
        Assertions.assertThat(Hello.world()).isEqualTo("Hello, world!");
    }
}