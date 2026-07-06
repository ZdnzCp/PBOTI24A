import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CSVCopy {
    public static void main(String[] args) {
        String sourceFile = "D:\\IT\\codes\\Tugas11PBO\\students.csv";
        String targetFile = "D:\\IT\\codes\\Tugas11PBO\\students_copy.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(sourceFile));
             BufferedWriter bw = new BufferedWriter(new FileWriter(targetFile))) {

            String line;
            int jumlahBaris = 0;

            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
                jumlahBaris++;
            }

            System.out.println("Berhasil menyalin " + jumlahBaris + " baris");
            System.out.println("dari " + sourceFile + " ke " + targetFile);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
