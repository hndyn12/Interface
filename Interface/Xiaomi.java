/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

/**
 *
 * @author X1
 */
public class Xiaomi implements Phone{

    private int volume;
    private boolean isPowerOn;
    
    public Xiaomi(){
        this.volume=50;
    }
    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Handphone Menyala");
        System.out.println("Selamat Datang di XIAOMI PHONE");
        System.out.println("Andoit Versi 100");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("Handphone Dimatikan");
    }

    @Override
    public void volumeUp() {
        if(isPowerOn){
            if(this.volume==MAX_VOLUME){
                System.out.println("Volume sudah 100%");
                System.out.println("Sudah "+this.getVolume()+"%");
            }else{
                this.volume+= 10;
                System.out.println("Volume sekarang: "+this.getVolume());
            }
        }else{
            System.out.println("Nyalakan dulu HP nya Bro....");
        }
    }

    @Override
    public void volumeDown() {
           if(isPowerOn){
            if(this.volume==MIN_VOLUME){
                System.out.println("Volume Sudah 0%");
                System.out.println("Sudah "+this.getVolume()+"%");
            }else{
                this.volume-= 10;
                System.out.println("Volume sekarang: "+this.getVolume());
            }
        }else{
            System.out.println("Nyalakan dulu HP nya Bro....");
        }
    }
    
    public int getVolume(){
        return this.volume;
    }
    
}
