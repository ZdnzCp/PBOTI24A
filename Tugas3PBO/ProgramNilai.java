package Tugas3PBO;

import java.util.Scanner;
import java.util.ArrayList;

class Mahasiswa {
    String nim, nama, grade, status;
    int nilai;

    public Mahasiswa(String nim, String nama, int nilai) {
        this.nim = nim;
        this.nama = nama;
        this.nilai = nilai;
        tentukanGrade();
    }

    private void tentukanGrade() {
        if (nilai >= 80 && nilai <= 100) {
            grade = "A";
            status = "lulus";
        } else if (nilai >= 70) {
            grade = "B";
            status = "lulus";
        } else if (nilai >= 60) {
            grade = "C";
            status = "lulus";
        } else if (nilai >= 50) {
            grade = "D";
            status = "tidak lulus";
        } else if (nilai >= 0 && nilai < 50) {
            grade = "E";
            status = "tidak lulus";
        } else {
            grade = "Error";
            status = "Input nilai anda salah";
        }
    }
}

public class ProgramNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Mahasiswa> listMahasiswa = new ArrayList<>();
        
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = input.nextInt();

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i + 1));
            System.out.print("NIM  : "); String nim = input.next();
            System.out.print("Nama : "); String nama = input.next();
            System.out.print("Nilai: "); int nilai = input.nextInt();
            
            listMahasiswa.add(new Mahasiswa(nim, nama, nilai));
        }

        System.out.println("\nHASIL OUTPUT:");
        double totalNilai = 0;
        int lulus = 0, tdkLulus = 0, gradeA = 0, gradeB = 0, gradeD = 0;
        String namaLulus = "", namaTdkLulus = "", namaA = "", namaB = "", namaD = "";

        for (Mahasiswa m : listMahasiswa) {
            System.out.println("NIM  : " + m.nim);
            System.out.println("Nama : " + m.nama);
            System.out.println("Nilai: " + m.nilai);
            System.out.println("Grade: " + m.grade);
            System.out.println("==========================================");

            totalNilai += m.nilai;
            if (m.status.equals("lulus")) {
                lulus++;
                namaLulus += m.nama + ", ";
            } else {
                tdkLulus++;
                namaTdkLulus += m.nama + ", ";
            }

            if (m.grade.equals("A")) { gradeA++; namaA += m.nama + ", "; }
            else if (m.grade.equals("B")) { gradeB++; namaB += m.nama + ", "; }
            else if (m.grade.equals("D")) { gradeD++; namaD += m.nama + ", "; }
        }

        System.out.println("Jumlah Mahasiswa : " + jumlah);
        System.out.println("Jumlah Mahasiswa yg Lulus : " + lulus + " yaitu " + namaLulus);
        System.out.println("Jumlah Mahasiswa yg Tidak Lulus : " + tdkLulus + " yaitu " + namaTdkLulus);
        System.out.println("Jumlah Mahasiswa dengan Nilai A : " + gradeA + " yaitu " + namaA);
        System.out.println("Jumlah Mahasiswa dengan Nilai B : " + gradeB + " yaitu " + namaB);
        System.out.println("Jumlah Mahasiswa dengan Nilai D : " + gradeD + " yaitu " + namaD);
        System.out.println("Rata-rata nilai mahasiswa adalah : " + (totalNilai / jumlah));
    }
}
