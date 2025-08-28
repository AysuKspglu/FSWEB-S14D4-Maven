package org.example.model;

public class Bread extends ProductForSale {
    private final int weightGrams;
    private final String flourType;

    // <-- TEST'in beklediği 3 parametreli ctor
    public Bread(String type, double price, String description) {
        super(type, price, description);
        this.weightGrams = 0;        // varsayılan
        this.flourType = "Unknown";  // varsayılan
    }

    // Ayrıntılı ctor
    public Bread(String type, double price, String description, int weightGrams, String flourType) {
        super(type, price, description);
        this.weightGrams = weightGrams;
        this.flourType = flourType;
    }

    public int getWeightGrams() { return weightGrams; }
    public String getFlourType() { return flourType; }

    @Override
    public void showDetails() {
        System.out.println("=== Bread ===");
        System.out.println("Type           : " + getType());
        System.out.println("Price          : " + getPrice());
        System.out.println("Description    : " + getDescription());
        System.out.println("Weight (g)     : " + weightGrams);
        System.out.println("Flour Type     : " + flourType);
        System.out.println("Sample(5 pcs)  : " + getSalesPrice(5));
        System.out.println();
    }
}
