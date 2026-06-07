package Abstraction;

public class Lingkaran extends Bentuk{
    private double radius;

    public Lingkaran(double radius)
    {
        this.nama = "Lingkaran";
        this.radius = radius;
    }

    @Override
    public double hitungLuas()
    {
        return Math.PI * radius * radius;
    }
}
