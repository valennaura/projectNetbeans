/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pemesananMakanan;

import java.util.Scanner;

/**
 *
 * @author khusn
 */
public class pemesananMakanan {
    String namaMakanan;
    int jumlahMakanan;
    String namaMinuman;
    int jumlahMinuman;
   
    public pemesananMakanan(String nama1, int jumlah1, String nama2, int jumlah2) {
        int hargaMakanan = 0;
        int hargaMinuman = 0;
        namaMakanan = nama1;
        jumlahMakanan = jumlah1;
        namaMinuman = nama2;
        jumlahMinuman = jumlah2;
        food:
                switch (namaMakanan) {
            case "A" :
                hargaMakanan = 10000;
                break;
            case "B" :
                hargaMakanan = 11000;
                break;
            case "C" :
                hargaMakanan = 12000;
                break;
            default :
                System.out.println("Inputan tidak valid");
                break;
        }
        switch (namaMinuman) {
            case "A" :
                hargaMinuman = 4000;
                break;
            case "B" :
                hargaMinuman = 3500;
                break;
            case "C" :
                hargaMinuman = 5000;
                break;
            default :
                System.out.println("Inputan tidak valid");
        }
        int totalMakanan = hargaMakanan * jumlahMakanan;
        int totalMinuman = hargaMinuman * jumlahMinuman;
        int total = totalMakanan + totalMinuman;
        System.out.println("Jumlah minuman : " + jumlahMinuman);
        System.out.println("Harga Minuman : " + hargaMinuman);
        System.out.println("Harga Makanan : " + totalMakanan);
        System.out.println("Total Makanan : " + totalMakanan);
        System.out.println("Total Minuman : " + totalMinuman);
        System.out.println("Total Seluruh : " + total);

    }
    
    public static void main(String[] args) {
        String namaMinuman;
        int jumlahMinuman;
        String namaMakanan;
        int jumlahMakanan;
        Scanner Sc = new Scanner(System.in);
        System.out.println("Makanan");
        System.out.println("A. Soto");
        System.out.println("B. Rendang");
        System.out.println("C. Rawon");
        System.out.println("Pilih Makanan");
        namaMakanan = Sc.next();
        System.out.println("Jumlah makanan yang dipilih");
        jumlahMakanan = Sc.nextInt();
        
        System.out.println("Minuman");
        System.out.println("A. Kopi");
        System.out.println("B. Teh");
        System.out.println("C. Susu");
        System.out.println("Pilih Minuman");
        namaMinuman = Sc.next();
        System.out.println("Jumlah minuman yang dipilih");
        jumlahMinuman = Sc.nextInt();
        pemesananMakanan PM = new pemesananMakanan(namaMakanan, jumlahMakanan, namaMinuman, jumlahMinuman);
    }
}

