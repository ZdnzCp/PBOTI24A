package Tugas4PBO;

class Bank {
    void transferUang(int jumlah, String rekeningTujuan, String bankTujuan) {
        int biayaAdmin;
        if (bankTujuan.equalsIgnoreCase("Bersama")) {
            biayaAdmin = 0;
        } else {
            biayaAdmin = 6500;
        }
        
        int total = jumlah + biayaAdmin;
        System.out.println("Transfer ke " + bankTujuan + " (" + rekeningTujuan + ")");
        System.out.println("Jumlah: Rp" + jumlah + " | Admin: Rp" + biayaAdmin);
        System.out.println("Total saldo terpotong: Rp" + total);
    }

    void sukuBunga() {
        System.out.println("Suku Bunga standar adalah 3%");
    }
}

class BankBNI extends Bank {
    @Override
    void sukuBunga() {
        System.out.println("Suku Bunga dari BNI adalah : 4%");
    }

    @Override
    void transferUang(int jumlah, String rekeningTujuan, String bankTujuan) {
        String tujuan = bankTujuan.equalsIgnoreCase("BNI") ? "Bersama" : bankTujuan;
        super.transferUang(jumlah, rekeningTujuan, tujuan);
    }
}

class BankBCA extends Bank {
    @Override
    void sukuBunga() {
        System.out.println("Suku Bunga dari BCA adalah : 4.5%");
    }

    @Override
    void transferUang(int jumlah, String rekeningTujuan, String bankTujuan) {
        String tujuan = bankTujuan.equalsIgnoreCase("BCA") ? "Bersama" : bankTujuan;
        super.transferUang(jumlah, rekeningTujuan, tujuan);
    }
}

public class TransferUang {
    public static void main(String[] args) {
        BankBNI bni = new BankBNI();
        BankBCA bca = new BankBCA();

        System.out.println("=== TRANSAKSI BNI ===");
        bni.transferUang(500000, "111222", "BNI");
        bni.transferUang(500000, "333444", "BCA");

        System.out.println("\n=== TRANSAKSI BCA ===");
        bca.transferUang(200000, "555666", "BCA");
        bca.transferUang(200000, "777888", "Mandiri");
    }
}