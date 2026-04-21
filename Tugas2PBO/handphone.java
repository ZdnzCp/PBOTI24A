package Tugas2PBO;

public class handphone {
    String jenis_hp;
    int tahun_pembuatan;

    public void setDataHP(String jenis_hp, int tahun_pembuatan) {
        this.jenis_hp = jenis_hp;
        this.tahun_pembuatan = tahun_pembuatan;
    }

    String getJenisHP() {
        return jenis_hp;
    }

    int getTahunPembuatan() {
        return tahun_pembuatan;
    }

    public static void main(String args[]) {
        handphone hp = new handphone();
        
        hp.setDataHP("Samsung S24", 2024);
        
        System.out.println("Jenis HP: " + hp.getJenisHP());
        System.out.println("Tahun Pembuatan: " + hp.getTahunPembuatan());
    }
}