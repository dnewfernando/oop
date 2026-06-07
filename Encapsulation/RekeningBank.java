public class RekeningBank {
    private String nomorRekening;
    private double saldo;

    public RekeningBank(String nomor, double saldoAwal){
        this.nomorRekening  = nomor;
        this.saldo          = saldoAwal;

        if(nomor != "" && saldoAwal > 0){
            System.out.println("Rekening dan Saldo awal berhasil ditambahkan: " +
                "\nNomor Rekening: " + this.nomorRekening +
                "\nSaldo Awal: " + this.saldo
            );
        } else {
            System.out.println("Nomor Rekening atau Saldo Awal tidak valid.");
        }
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void setor(double jumlah){
        if(jumlah > 0)
        {
            this.saldo += jumlah;
            System.out.println("Setoran berhasil. Saldo baru: "+ this.saldo);
        }
        else
        {
            System.out.println("Jumlah setoran tidak valid.");
        }
    }

    public void tarik(double jumlah){
        if(jumlah > 0 && jumlah <= this.saldo){
            this.saldo -= jumlah;
            System.out.println("Penarikan berhasil. Saldo baru: " + this.saldo);
        } else{
            System.out.println("Penarikan gagal. Saldo tidak cukup atau jumlah tidak valid.");
        }
    }
}