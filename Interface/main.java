/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

import java.util.Scanner;

/**
 *
 * @author X1
 */
public class main {
    public static void main(String[] args) {
        Phone Redmi3Pro = new Xiaomi();
        
        Phoneuser Handa = new Phoneuser(Redmi3Pro);
        
        Handa.turnOnThePhone();
        
        Scanner input = new Scanner(System.in);
        String aksi;
        
        while(true){
            System.out.println("=======Aplikasi Interface=======");
            System.out.println("1. Nyalakan HP");
            System.out.println("2. Matikan HP");
            System.out.println("3. Perbesar Volume");
            System.out.println("4. kecilkan voulme");
            System.out.println("0. keluar");
            System.out.println("Pilih aksi");
             aksi=input.nextLine();
            switch (aksi) {
                case "1":
                    Handa.turnOnThePhone();
                    break;
                case "2":
                    Handa.turnOffThePhone();
                    break;
                case "3":
                    Handa.makePhoneLouder();
                    break;
                case "4":
                    Handa.makePhoneSilent();
                    break;
                case "0":
                    System.exit(0);
                default:
                    System.out.println("Angka yang anda tekan salah");
                    break;
            }
        }
    }
}
