package Tugas5PBO;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input Student
        System.out.print("Masukkan nama mahasiswa: ");
        String namaMhs = input.nextLine();
        System.out.print("Masukkan alamat mahasiswa: ");
        String alamatMhs = input.nextLine();

        Student student = new Student(namaMhs, alamatMhs);

        System.out.print("Berapa jumlah mata kuliah? ");
        int jumlahMk = input.nextInt();
        input.nextLine();

        for (int i = 0; i < jumlahMk; i++) {
            System.out.print("Nama mata kuliah: ");
            String mk = input.nextLine();
            System.out.print("Nilai: ");
            int nilai = input.nextInt();
            input.nextLine();

            student.addCourseGrade(mk, nilai);
        }

        System.out.println("\nData Mahasiswa:");
        System.out.println(student);
        student.printGrades();
        System.out.println("Rata-rata: " + student.getAverageGrade());

        // Input Teacher
        System.out.print("\nMasukkan nama dosen: ");
        String namaDosen = input.nextLine();
        System.out.print("Masukkan alamat dosen: ");
        String alamatDosen = input.nextLine();

        Teacher teacher = new Teacher(namaDosen, alamatDosen);

        System.out.print("Berapa mata kuliah yang diampu? ");
        int jumlahAjar = input.nextInt();
        input.nextLine();

        for (int i = 0; i < jumlahAjar; i++) {
            System.out.print("Nama mata kuliah: ");
            String mk = input.nextLine();
            boolean sukses = teacher.addCourse(mk);

            if (!sukses) {
                System.out.println("Mata kuliah sudah ada!");
            }
        }

        System.out.println("\nData Dosen:");
        System.out.println(teacher);

        input.close();
    }
}