import java.io.*;

public class Test3 {
    public void methodA() {
        System.out.println("Method A");
    }

    public void methodB() throws IOException {
        System.out.println(20 / 0);
        System.out.println("Method B");
    }
}

class Utama {
    public static void main(String[] args) {
        Test3 o = new Test3();
        o.methodA();
        try {
            o.methodB();
        } catch (java.lang.Exception e) {
            System.out.println("Error di Method B");
        } finally {
            System.out.println("Ini selalu dicetak");
        }
    }
}

//Analisis:
//Pada kode di atas, terdapat dua method yaitu methodA dan methodB. MethodA hanya mencetak "Method A" ke layar, sedangkan methodB mencoba melakukan pembagian dengan nol yang akan menyebabkan ArithmeticException. MethodB juga dideklarasikan untuk melempar IOException, tetapi tidak ada kode yang benar-benar melempar IOException di dalamnya.
//Di dalam method main, objek dari kelas Test3 dibuat dan methodA dipanggil. Kemudian, methodB dipanggil di dalam blok try-catch. Ketika methodB dipanggil, ArithmeticException terjadi karena pembagian dengan nol, dan exception tersebut ditangkap oleh blok catch yang mencetak "Error di Method B". Terakhir, blok finally selalu dieksekusi dan mencetak "Ini selalu dicetak" ke layar.