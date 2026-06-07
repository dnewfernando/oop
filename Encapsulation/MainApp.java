public class MainApp {
    public static void main(String[] args){
        RekeningBank rekeningSaya = new RekeningBank("12345", 1000000.0);
        
        rekeningSaya.setor(500000.0);
        rekeningSaya.tarik(200000.0);

        System.out.println("Sisa saldo di rekening: " + rekeningSaya.getSaldo());
    }
}