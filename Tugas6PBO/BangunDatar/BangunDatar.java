package Tugas6PBO.BangunDatar;

public abstract class BangunDatar {
    String Warna;

    String getWarna() {
        return Warna;
    }

    void setWarna(String Warna) {
        this.Warna = Warna;
    }

    abstract float getLuas();
}
