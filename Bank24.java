import java.util.Scanner;

public class Bank24 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jml_tabungan_awal, lama_menabung;
        double prosentase_bunga =0.02, bunga, jml_tabungan_akhir;

        // Input
        System.out.println ("masukkan jumlah tabungan awal anda");
        jml_tabungan_awal = input.nextInt();
        System.out.println ("masukkan lama menabung anda");
        lama_menabung= input.nextInt();

        // Proses hitung bunga
        bunga= lama_menabung*prosentase_bunga*jml_tabungan_awal;

        // Hitung jumlah tabungan akhir
        jml_tabungan_akhir=bunga+jml_tabungan_awal;

        // Output
        System.out.println ("Bunga adalah " +bunga);
        System.out.println ("Jumlah tabungan akhir anda adalah " +jml_tabungan_akhir);
    }
}