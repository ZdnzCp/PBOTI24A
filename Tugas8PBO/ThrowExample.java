public class ThrowExample {
    static void demo() {
        NullPointerException t;
        t = new NullPointerException("Coba Throw");
        throw t;
    }

    public static void main(String[] args) {
        try {
            demo();
            System.out.println("Selesai");
        } catch (NullPointerException e) {
            System.out.println("Ada pesan error: " + e);
        }
    }
}

//Analisis:
//Pada program diatas terdapat method demo() yang melemparkan exception NullPointerException dengan pesan "Coba Throw". Pada method main(), demo() dipanggil dalam blok try-catch. Ketika demo() dipanggil, exception dilemparkan dan ditangkap oleh blok catch, yang kemudian mencetak pesan error. Program ini menunjukkan bagaimana cara melempar dan menangani exception di Java.

