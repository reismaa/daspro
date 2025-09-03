import java.util.Scanner;

public class StudiKasus2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int panjang, lebar, diameter, sisi;
        double luas_tanah, luas_lingkaran, luas_persegi, total_kolam, luas_rumput;

        // input
        System.out.print("masukkan panjang tanah (meter): ");
        panjang = sc.nextInt();
        System.out.print("masukkan lebar tanah (meter): ");
        lebar = sc.nextInt();
        System.out.println("masukkan diameter kolam lingkaran (meter): ");
        diameter = sc.nextInt();
        System.out.println("masukkan sisi kolam persegi (meter): ");
        sisi = sc.nextInt();

        // proses hitung
        luas_tanah = panjang * lebar;
        luas_lingkaran = Math.PI * Math.pow(diameter / 2.0, 2);
        luas_persegi = sisi * sisi;
        total_kolam = (2 * luas_lingkaran) + luas_persegi;
        luas_rumput = luas_tanah - total_kolam;

        // output
        System.out.println("Luas tanah          : " + luas_tanah + " m2");
        System.out.println("Luas 2 kolam lingkaran : " + (2 * luas_lingkaran) + " m2");
        System.out.println("Luas kolam persegi   : " + luas_persegi + "  m2");
        System.out.println("Total luas kolam    : " + total_kolam + " m2");
        System.out.println("---------------------------------");
        System.out.println("Luas rumput taman   : " + luas_rumput + " m2");
    }
}
