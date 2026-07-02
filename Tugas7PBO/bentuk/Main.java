package bentuk;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Bentuk> daftarBentuk = new ArrayList<>();
        daftarBentuk.add(new Lingkaran(7));
        daftarBentuk.add(new PersegiPanjang(4, 6));
        daftarBentuk.add(new Lingkaran(3));

        System.out.println("=== DAFTAR LUAS BENTUK ===");

        for (Bentuk b : daftarBentuk) {
            b.tampilkan();
        }
    }
}