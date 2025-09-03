import java.util.Scanner;

public class StudiKasus1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int gaji_pokok, jml_anak, tunjangan_per_anak, total_tunjangan;
        double potongan_pensiun, gaji_bersih;

        // input
        System.out.println("masukkan gaji pokok anda: ");
        gaji_pokok = input.nextInt();
        System.out.println("masukkan jumlah anak anda: ");
        jml_anak = input.nextInt();
        System.out.println("masukkan jumlah tunjangan per anak: ");
        tunjangan_per_anak = input.nextInt();

        // proses
        total_tunjangan = jml_anak * tunjangan_per_anak;
        potongan_pensiun = 0.05 * gaji_pokok;
        gaji_bersih = gaji_pokok + total_tunjangan - potongan_pensiun;

        // output
        System.out.println("================================");
        System.out.println("Gaji Pokok       : Rp " + gaji_pokok);
        System.out.println("Jumlah Anak      : " + jml_anak);
        System.out.println("Total Tunjangan  : Rp " + total_tunjangan);
        System.out.println("Potongan Pensiun : Rp " + potongan_pensiun);
        System.out.println("Gaji Bersih      : Rp " + gaji_bersih);
    }
}