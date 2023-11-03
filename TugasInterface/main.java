/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasInterface;

import java.util.Scanner;

/**
 *
 * @author X1
 */
public class main {
    public static void main(String[] args) {
        ATM bca = new account(100000);
        Scanner input = new Scanner(System.in);
        String tombol;
        while(true){
            System.out.println("Selamat datang");
            System.out.println("1. Cek saldo");
            System.out.println("2. Setor Uang");
            System.out.println("3. Tarik Uang");
            System.out.println("0. keluar");
            System.out.println("Pilih tombol");
             tombol=input.nextLine();
            switch (tombol) {
                case "1":
                    bca.ceksaldo();
                    break;
                case "2":
                    bca.setoruang(100000);
                    break;
                case "3":
                    bca.tarikuang(50000);
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
