import java.util.ArrayList;

public class ContohArrayList {
    public static void main(String[] args) {
        ArrayList<String> daftarMahasiswa = new ArrayList<>();

        daftarMahasiswa.add("Ferdi");
        daftarMahasiswa.add("Budi");
        daftarMahasiswa.add("Siti");
        daftarMahasiswa.add("Andi");
        
        System.out.println("Daftar awal: " + daftarMahasiswa);
        System.out.println("Mahasiswa index ke-1: " + daftarMahasiswa.get(1));
        daftarMahasiswa.set(2, "Siti Aminah");
        daftarMahasiswa.remove("Andi");
        System.out.println("Daftar setelah diubah: " + daftarMahasiswa);
        System.out.println("Menampilkan semua data:");
        for (String nama : daftarMahasiswa) {
            System.out.println("- " + nama);
        }
        System.out.println("Jumlah mahasiswa: " + daftarMahasiswa.size());
    }
}