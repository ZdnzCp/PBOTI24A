package bentuk;

public abstract class Bentuk implements Bisadihitung {

    private String nama;

    public Bentuk(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    @Override
    public abstract double luas();

    public void tampilkan() {
        System.out.printf("%-15s luas = %.2f%n", nama, luas());
    }
}