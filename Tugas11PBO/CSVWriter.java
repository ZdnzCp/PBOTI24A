import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CSVWriter {
    public static void main(String[] args) {
        String csvFile = "D:\\IT\\codes\\Tugas11PBO\\new_students.csv";
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah data mahasiswa: ");
        int jumlahData = scanner.nextInt();
        scanner.nextLine();

        String[] data = new String[jumlahData];

        for (int i = 0; i < jumlahData; i++) {
            System.out.print("Masukkan NIM ke-" + (i + 1) + ": ");
            String nim = scanner.nextLine();

            System.out.print("Masukkan Nama ke-" + (i + 1) + ": ");
            String nama = scanner.nextLine();

            System.out.print("Masukkan Umur ke-" + (i + 1) + ": ");
            String umur = scanner.nextLine();

            data[i] = nim + "," + nama + "," + umur;
        }

        scanner.close();

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(csvFile))) {
            for (String line : data) {
                bw.write(line);
                bw.newLine();
            }
            System.out.println("Data berhasil ditulis ke " + csvFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
