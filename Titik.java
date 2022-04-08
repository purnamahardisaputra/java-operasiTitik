/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.purnamahardisaputra.pertemuan2.unguided;

import java.util.Scanner;

/**
 *
 * @author purna
 */
public class Titik {
    private int x;
    private int y;
    
    public Titik(){
        this.x = x;
        this.y = y;
    }
    
    void inisialisasiTitik(Scanner iniTial){
        System.out.print("Masukan Nilai X : ");
        x = iniTial.nextInt();
        System.out.print("Masukan Nilai Y : ");
        y = iniTial.nextInt();
    }
    
    void tampilTitik(){
        System.out.println("Nilai X adalah : " + x);
        System.out.println("Nilai Y adalah : " + y);
    }
    
    void perkalianSkalar(){
        int Skalar = this.x * this.y;
        System.out.println("Perkalian Skalar antara X dan Y  : " + Skalar);
    }
    
    void xAxis(){
        this.y = (y-(y+y));
    }
    
    void yAxis(){
        this.x = (x-(x+x));
    }
    
    int jarak(Scanner iniTial1){
        int x2, y2;
        int Titik2;
        System.out.print("Masukan Nilai X2 : ");
        x2 = iniTial1.nextInt();
        System.out.print("Masukan Nilai Y2 : ");
        y2 = iniTial1.nextInt();
        
        int Jarak1 = (x2 - x);
        int Jarak2 = (y2 - y);
        Titik2 = (int) (Math.pow(Jarak1,2) + Math.pow(Jarak2, 2));
        System.out.println("Kuadrat Kedua Jarak adalah = " + Math.sqrt(Titik2));
        return Titik2;
    }
    
    
    public static void main(String[] args) {
        //inisalisasi
        Scanner iniTial = new Scanner(System.in);
        Scanner iniTial1 = new Scanner(System.in);
        Scanner Menu = new Scanner(System.in);
     
        Titik coba = new Titik();
        int selection;
        
        do{
        System.out.println("\nMENU OPERASI TITIK");
        System.out.println("1. INISIALISASI TITIK ");
        System.out.println("2. TAMPIL TITIK ");
        System.out.println("3. PERKALIAN SKALAR TITIK ");
        System.out.println("4. PENCERMINAN TERHADAP SUMBU X ");
        System.out.println("5. PENCERMINAN TERHADAP SUMBU Y ");
        System.out.println("6. JARAK ANTAR DUA TITIK ");
        System.out.println("0. KELUAR ");
        System.out.print("MASUKAN PILIHAN : " );
        selection = Menu.nextInt();
        
        switch(selection){
          case 1:
            // handle 1
              System.out.println("\nINISIALISASI TITIK");
              coba.inisialisasiTitik(iniTial);
            break;
          case 2:
            // handle 2
              System.out.println("\nFUNGSI MENAMPILKAN TITIK \n");
              coba.tampilTitik();
            break;
          case 3:
            // handle 3
              System.out.println("FUNGSI PERKALIAN SKALAR X DAN Y\n");
              coba.perkalianSkalar();
            break;
          case 4:
            // handle 4
              System.out.println("FUNGSI PENCERMINAN TERHADAP SUMBU X\n");
              coba.xAxis();
            break;
          case 5:
            // handle 5
              System.out.println("FUNGSI PENCERMINAN TERHADAP SUMBU Y\n");
              coba.yAxis();
            break;
          case 6:
            // handle 5
              System.out.println("FUNGSI MENGHITUNG JARAK ANTARA DUA TITIK \n");
              coba.jarak(iniTial1);
            break;
          case 0:
              System.out.println("Program Diberhentikan!!!");
              System.exit(0);
            // handle 5
            break;
          default:
              System.out.println("Input is invalid");
            break;
        }
        }while(selection != 0);

    }
    
    
}
