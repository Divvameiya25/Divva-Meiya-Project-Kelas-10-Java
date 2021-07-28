/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagithub;

/**
 *
 * @author MSI PC
 */
import java.util.Scanner;
public class JavaGithub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Double NIK;       
        int Jumlahorang, harga, hari, totalharga, bayar, kembali;
        String Nama;
                
        Scanner input = new Scanner(System.in);
        
        System.out.println("===================================================");
        System.out.println("         SELAMAT DATANG DI HOTEL DE LUNA"            );
        System.out.println("===================================================");
        System.out.println();
        System.out.println("Silahkan masukkan:");
        System.out.print("1. NIK : ");
        NIK = input.nextDouble();
        System.out.print("2. Nama : ");
        String nama = input.next();
        System.out.print("3. Jumlahorang : ");
        Jumlahorang = input.nextInt();
        
        
        System.out.println("===================================================");
        System.out.println("  Room Choice                           Price      ");
        System.out.println("---------------------------------------------------");
        System.out.println("1. Standard Room                   Rp 400.000/malam");
        System.out.println("2. Superior Room                   Rp 600.000/malam");
        System.out.println("3. Deluxe Room                     RP 850.000/malam");
        System.out.println("4. Junior Suite Room             Rp 1.000.000/malam");
        System.out.println("5. Presidential Room             Rp 1.999.000/malam");
        System.out.println("===================================================");
        System.out.print("Masukkan Nomor Pilihan Kamar : ");
        int pilihan = input.nextInt();
        
        switch ( pilihan ) {
          case 1:
              System.out.println("Standard Room");
              harga = (int) 400000; 
              System.out.print("Masukkan Berapa Hari : ");
              hari = input.nextInt();
              totalharga = hari * harga;
              System.out.println("Total Harga : Rp " + totalharga);
              System.out.print("Uang Yang Dibayar : Rp ");
              bayar = input.nextInt();
              kembali = bayar - totalharga;
              System.out.println("Uang Kembalian : Rp " +  kembali);
              break;
              
          case 2:
              System.out.println("Superior Room");
              harga = (int) 600000;
              System.out.print("Masukkan Berapa Hari : ");
              hari = input.nextInt();
              totalharga = hari * harga;
              System.out.println("Total Harga : Rp " + totalharga);
              System.out.print("Uang Yang Dibayar : Rp ");
              bayar = input.nextInt();
              kembali = bayar - totalharga;
              System.out.println("Uang Kembalian : Rp " + kembali);
              break;
              
          case 3:
              System.out.println("Deluxe Room");
              harga = (int) 850000;
              System.out.print("Masukkan Berapa Hari : ");
              hari = input.nextInt();
              totalharga = hari * harga;
              System.out.println("Total Harga : Rp " + totalharga);
              System.out.print("Uang Yang Dibayar : Rp ");
              bayar = input.nextInt();
              kembali = bayar - totalharga;
              System.out.println("Uang Kembalian : Rp " + kembali);
              break;
              
          case 4:
              System.out.println("Junior Suite Room");
              harga = (int) 1000000;
              System.out.print("Masukkan Berapa Hari : ");
              hari = input.nextInt();
              totalharga = hari * harga;
              System.out.println("Total Harga : Rp " + totalharga);
              System.out.print("Uang Yang Dibayar : Rp ");
              bayar = input.nextInt();
              kembali = bayar - totalharga;
              System.out.println("Uang Kembalian : Rp " + kembali);
              break;
              
          case 5:
              System.out.println("Presindential Room");
              harga = (int) 1999000;
              System.out.print("Masukkan Berapa Hari : ");
              hari = input.nextInt();
              totalharga = hari * harga;
              System.out.println("Total Harga : Rp " + totalharga);
              System.out.print("Uang Yang Dibayar : Rp ");
              bayar = input.nextInt();
              kembali = bayar - totalharga;
              System.out.println("Uang Kembalian : Rp " + kembali);
              break;
              
        }   
    }
    }
    

