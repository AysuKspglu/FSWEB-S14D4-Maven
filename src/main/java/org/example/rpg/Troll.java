package org.example.rpg;

public class Troll extends Monster implements Bleedable, Poisonable {

    public Troll(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    // Kanatma varsa: getDamage() * 0.25
    @Override
    public double bleed() {
        return getDamage() * 0.25;
    }

    // Zehirleme varsa: getDamage() * 0.3
    @Override
    public double poison() {
        return getDamage() * 0.3;
    }
}

