package com.maddenabbott.iboma;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class ExampleTest {
    @Autowired
    private Example example;

    @Test
    public void shouldRead() {
        Map<String, String> expected = new HashMap<>();
        expected.put("message", "Hello, world!");

        Map<String, String> actual = example.read("{ \"message\": \"Hello, world!\" }");

        assertThat(actual).isEqualTo(expected);
    }

}