package Inheritance;

public class Hewan {
    String nama;

    public Hewan(String nama)
    {
        this.nama = nama;
    }

    public void makan()
    {
        System.out.println(this.nama + " sedang makan");
    }

    public void bersuara()
    {
        System.out.println("Hewan ini mengeluarkan suara...");
    }
}
