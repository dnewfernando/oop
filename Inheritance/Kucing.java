package Inheritance;

public class Kucing extends Hewan{  
    
    public Kucing(String nama)
    {
        super(nama);
    }
    
    @Override
    public void bersuara()
    {
        System.out.println(nama + " berkata: Meow!");
    }

    public void panjatPohon()
    {
        System.out.println(nama + " sedang memanjat pohon.");
    }
}
