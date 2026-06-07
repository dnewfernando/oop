package Abstraction;

public abstract class Bentuk {
    String nama;

    public abstract double hitungLuas();

    public void getNamaBentuk()
    {
        System.out.println("Nama bentuk: " + nama);
    }
}
