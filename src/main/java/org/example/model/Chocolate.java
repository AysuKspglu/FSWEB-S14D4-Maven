package org.example.model;

public class Chocolate extends ProductForSale {
    private final int cocoaPercent; // % kakao

    // <-- TEST'in beklediği 3 parametreli ctor
    public Chocolate(String type, double price, String description) {
        super(type, price, description);
        this.cocoaPercent = 0; // varsayılan
    }

    // Senin ayrıntılı ctor'un kalsın
    public Chocolate(String type, double price, String description, int cocoaPercent) {
        super(type, price, description);
        this.cocoaPercent = cocoaPercent;
    }

    public int getCocoaPercent() { return cocoaPercent; }

    @Override
    public void showDetails() {
        System.out.println("=== Chocolate ===");
        System.out.println("Type           : " + getType());
        System.out.println("Price          : " + getPrice());
        System.out.println("Description    : " + getDescription());
        System.out.println("Cocoa %        : " + cocoaPercent);
        System.out.println("Sample(3 pcs)  : " + getSalesPrice(3));
        System.out.println();
    }
}
