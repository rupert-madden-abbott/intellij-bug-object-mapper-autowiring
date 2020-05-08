package com.maddenabbott.iboma;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.UncheckedIOException;
import java.util.Map;

public class Example {
    private final ObjectMapper objectMapper;

    public Example(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public Map<String, String> read(String value) {
        try {
            return objectMapper.readValue(value, new TypeReference<Map<String, String>>() {});
        } catch (JsonProcessingException e) {
            throw new UncheckedIOException(e);
        }
    }
}
