package Tugas6PBO.Laptop.app;

import java.util.Scanner;
import Tugas6PBO.Laptop.model.Laptop;
import Tugas6PBO.Laptop.model.LaptopUser;
import Tugas6PBO.Laptop.model.Toshiba;

public class MainToshiba {
    public static void main(String[] args) {

        Laptop sattelite = new Toshiba();
        LaptopUser yajit = new LaptopUser(sattelite);

        Scanner input = new Scanner(System.in);
        String command;

        System.out.println("=== MENU LAPTOP ===");
        System.out.println("ON   : Nyalakan Laptop");
        System.out.println("OFF  : Matikan Laptop");
        System.out.println("UP   : Volume Naik");
        System.out.println("DOWN : Volume Turun");
        System.out.println("EXIT : Keluar");

        while (true) {
            System.out.print("Masukkan perintah: ");
            command = input.nextLine();

            if (command.equalsIgnoreCase("ON")) {
                yajit.turnOnLaptop();
            } 
            else if (command.equalsIgnoreCase("OFF")) {
                yajit.turnOffLaptop();
            } 
            else if (command.equalsIgnoreCase("UP")) {
                yajit.makeLaptopLouder();
            } 
            else if (command.equalsIgnoreCase("DOWN")) {
                yajit.makeLaptopSilence();
            } 
            else if (command.equalsIgnoreCase("EXIT")) {
                System.out.println("Laptop Dimatikan");
                break;
            } 
            else {
                System.out.println("Perintah tidak dikenali");
            }
        }

        input.close();
    }
}
