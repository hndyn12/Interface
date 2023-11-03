/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasInterface;

/**
 *
 * @author X1
 */
public class account implements ATM{
    private double saldo;
    
    public account(double saldoawal){
        saldo=saldoawal;
    }
    
    @Override
    public void ceksaldo() {
        System.out.println("Saldo Anda Saat ini = "+saldo);
    }

    @Override
    public void setoruang(double jumlah) {
        saldo+= jumlah;
        System.out.println("Penyetoran anda berhasil Saldo anda ="+saldo);
    }

    @Override
    public void tarikuang(double jumlah) {
        if(saldo >= jumlah){
        saldo-= jumlah;
        System.out.println("Penarikan behasil, sisa saldo anda ="+saldo);
    } else {
            System.out.println("saldo tidak cukup");
        } 
}
}
