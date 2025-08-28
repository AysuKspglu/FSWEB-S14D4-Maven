package org.example.model;

public class Store {

    public static void listProducts(ProductForSale[] products) {
        if (products == null) return;
        for (ProductForSale p : products) {
            if (p != null) {
                p.showDetails();
            }
        }
    }

    public static void main(String[] args) {
        ProductForSale[] products = new ProductForSale[] {
                new Chocolate("Chocolate", 49.90, "70% dark; nutty notes", 70),
                new Coke("Coke", 19.50, "Refreshing cola drink", 330, true),
                new Bread("Bread", 15.75, "Daily sourdough loaf", 750, "Wheat")
        };

        listProducts(products);
    }
}
