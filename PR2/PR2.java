package PR2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PR2 {
    public static void main(String[] args) {
        Map<String, String> noHP = new HashMap<>();
        noHP.put("Danu", "0891234567890");
        noHP.put("Rizki","0851234567890");

        Scanner inputNama = new Scanner(System.in);
        Scanner inputNomor = new Scanner(System.in);
        Scanner confirm = new Scanner(System.in);

        while (true) {
            System.out.print("\nMasukan nama kontak (atau ketik keluar): ");
            String namaKontak = inputNama.nextLine();

            if(namaKontak.equalsIgnoreCase("keluar"))
            {
                break;
            }

            System.out.print("Masukan nomor HP: ");
            String nomorKontak = inputNomor.nextLine();

            System.out.print("Apakah Anda ingin melanjutkan? (y/n): ");
            String confirmation = confirm.nextLine();

            if(confirmation.equalsIgnoreCase("n"))
            {   
                System.out.println("\nTerima kasih telah Hashmap Sederhana!");
                inputNama.close();
                inputNomor.close();
                confirm.close();
            }

            if(confirmation.equalsIgnoreCase("y"))
            {
                noHP.put(namaKontak, nomorKontak);
                
                for (Map.Entry<String, String> entry : noHP.entrySet()) 
                {
                    System.out.println(entry.getKey() + ": " + entry.getValue());
                }   
            }
        }
    }
}
