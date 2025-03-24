ackage com.example.Product;

import java.math.BigDecimal;

public record ProductResponse(String id, String name, String description, BigDecimal price) {
}