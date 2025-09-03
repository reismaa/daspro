public class ContohVariabel24 {

    public static void main(String[] args) {
        String hobi = "Bermain petak umpet";
        boolean Pandai = true;
        char jenisKelamin = 'P';
        byte umur= 18;
        double ipk = 3.24, tinggi = 1.69;
        System.out.println(hobi);
        System.out.println("Apakah pandai? " + Pandai);
        System.out.println("Jenis kelamin:" + jenisKelamin);
        System.out.println("Umurku saat ini:" + umur);
        System.out.println(String.format("Saya ber-IPK %.2f, dengan tinggi badan %.2f", ipk, tinggi));
    }
}
