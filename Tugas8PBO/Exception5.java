public class Exception5 {
    public static void main(String[] args) {
        int bil = 10;
        try {
            System.out.println(bil / 0);
        } catch (ArithmeticException e) {
            System.out.println("Pesan error: ");
            System.out.println(e.getMessage());
            System.out.println("Info stack erase");
            e.printStackTrace();
            e.printStackTrace(System.out);
        } catch (java.lang.Exception e) {
            System.out.println("Ini menghandle error yang terjadi");
        }
    }
}

//Analisis: 
//Pada program diatas, terdapat sebuah program yang mencoba untuk membagi bilangan 10 dengan 0. Hal ini akan menyebabkan terjadinya ArithmeticException karena pembagian dengan nol tidak diperbolehkan dalam matematika.
//Program ini menggunakan blok try-catch untuk menangani exception yang mungkin terjadi. Ketika ArithmeticException terjadi, program akan mencetak pesan error menggunakan e.getMessage() dan menampilkan informasi stack trace menggunakan e.printStackTrace(). Selain itu, program juga menangani exception umum dengan blok catch yang menangkap java.lang.Exception, meskipun dalam kasus ini tidak akan terjadi karena ArithmeticException sudah ditangani sebelumnya.