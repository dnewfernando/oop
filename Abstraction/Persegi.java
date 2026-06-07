package Abstraction;

public class Persegi extends Bentuk{
    private double sisi;

    public Persegi(double sisi)
    {
        this.nama = "Persegi";
        this.sisi = sisi;
    }

    @Override
    public double hitungLuas()
    {
        return sisi*sisi;
    }
}
