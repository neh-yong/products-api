package uk.ac.westminster.products_api;

public record CreateProductRequest(
        String name,
        int qty,
        boolean inStock,
        double unitPrice

) {
}
