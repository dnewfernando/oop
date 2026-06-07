package Abstraction;

public class MainApp {
    public static void main(String[] args) {
        Bentuk lingkaran = new Lingkaran(10);
        Bentuk persegi = new Persegi(5);

        System.out.println("Luas Lingkaran: " + lingkaran.hitungLuas());
        System.out.println("Luas Persegi: " + persegi.hitungLuas());
    }
}
