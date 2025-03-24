package com.example.Product;

import java.math.BigDecimal;

public record ProductRequest(String name, String description, BigDecimal price) {
}