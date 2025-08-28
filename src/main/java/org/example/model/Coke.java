package org.example.model;

public class Coke extends ProductForSale {
    private final int volumeMl;
    private final boolean diet;

    // <-- TEST'in beklediği 3 parametreli ctor
    public Coke(String type, double price, String description) {
        super(type, price, description);
        this.volumeMl = 0;     // varsayılan
        this.diet = false;     // varsayılan
    }

    // Ayrıntılı ctor
    public Coke(String type, double price, String description, int volumeMl, boolean diet) {
        super(type, price, description);
        this.volumeMl = volumeMl;
        this.diet = diet;
    }

    public int getVolumeMl() { return volumeMl; }
    public boolean isDiet() { return diet; }

    @Override
    public void showDetails() {
        System.out.println("=== Coke ===");
        System.out.println("Type           : " + getType());
        System.out.println("Price          : " + getPrice());
        System.out.println("Description    : " + getDescription());
        System.out.println("Volume (ml)    : " + volumeMl);
        System.out.println("Diet           : " + (diet ? "Yes" : "No"));
        System.out.println("Sample(2 pcs)  : " + getSalesPrice(2));
        System.out.println();
    }
}
