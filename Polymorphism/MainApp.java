package Polymorphism;

import Inheritance.Hewan;
import Inheritance.Kucing;

public class MainApp {
    public static void main(String[] args) {
        Hewan hewan1 = new Kucing("Kitty");
        Hewan hewan2 = new Anjing("Doggy");

        hewan1.bersuara();
        hewan2.bersuara();

        interaksiDenganHewan(hewan1);
        interaksiDenganHewan(hewan2);
    }

    public static void interaksiDenganHewan(Hewan h)
    {
        System.out.println("Saat berinteraksi, ");
        h.bersuara();
    }
}
