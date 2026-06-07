package Inheritance;

public class Hewan {
    public String nama;

    public Hewan(String nama)
    {
        this.nama = nama;
    }

    public void makan()
    {
        System.out.println(nama + " sedang makan");
    }

    public void bersuara()
    {
        System.out.println("Hewan ini mengeluarkan suara...");
    }
}
