import java.io.*;

public class FileMerge {
    public static void main(String[] args) {
        String[] files = {"D:\\IT\\codes\\Tugas11PBO\\file1.txt", "D:\\IT\\codes\\Tugas11PBO\\file2.txt"};
        String mergedFile = "D:\\IT\\codes\\Tugas11PBO\\merge.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(mergedFile))) {
            for (String file : files) {
                try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                    String line;
                    while ((line = br.readLine()) != null) {
                        bw.write(line);
                        bw.newLine();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("File berhasil digabungkan ke " + mergedFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
