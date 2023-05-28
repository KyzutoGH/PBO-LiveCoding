/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package LiveCodingPertama;

import java.util.Scanner;

/**
 *
 * @author Muhammad Ikhsan - 22104410004
 * Teknik Informatika - Universitas Islam Balitar
 * 2022 - 2023
 * User - TheVancr
 */
public class MainKinetic {
    
    //Inisiasi Variabel
    public double massa, kecepatan;
    
    //Metode get mengembalikan nilai variabel massa.
    public double getMassa() {
        return massa;
    }
    
    /*Metode set mengambil parameter (massa) dan menugaskannya ke namevariabel. 
    Kata this keyword digunakan untuk merujuk ke objek saat ini.*/
    public void setMassa(double massa) {
        this.massa = massa;
    }
    
    //Metode get mengembalikan nilai variabel kecepatan.
    public double getKecepatan() {
        return kecepatan;
    }
    
    /*Metode set mengambil parameter (kecepatan) dan menugaskannya ke namevariabel. 
    Kata this keyword digunakan untuk merujuk ke objek saat ini.*/
    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
    }
    
    //Method Menghitung
    public double hitung(){
        return 0.5*massa*Math.pow(kecepatan,2);
    }
    
    //Main Method
    public static void main(String[] args) {
        
        MainKinetic kinetik = new MainKinetic();
        
        //Inputan Keyboard
        System.out.println("Masukkan Massa : ");
        Scanner varMassa = new Scanner(System.in);
        System.out.println("Masukkan kecepatan Benda : ");
        Scanner varKecepatan = new Scanner(System.in);
        
        //Pembacaan Inputan Keyboard
        kinetik.setMassa(varMassa.nextDouble());
        kinetik.setKecepatan(varKecepatan.nextDouble());
        
        //Memanggil method hitung
        System.out.println(kinetik.hitung());
    }
    
}