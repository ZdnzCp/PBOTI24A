import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {
    public static void main(String[] args) {
        String csvFile = "D:\\IT\\codes\\Tugas11PBO\\students.csv";
        String line;
        String csvSplitBy = ",";
        int indeks = 0;
        int jumlahData = 0;
        System.out.println("NIM, NAMA, UMUR, PRODI");
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                indeks++;
                if (indeks > 1) { // lewati baris header
                    jumlahData++;
                    String[] student = line.split(csvSplitBy);
                    System.out.println(student[0] + ", " + student[1] + ", " +
                            student[2] + ", " + student[3]);
                }
            }
            System.out.println("Jumlah baris data: " + jumlahData);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
