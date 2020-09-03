/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restoranmakanan;

/**
 *
 * @author windows x
 */
public class makanan {
    public static void main(String[] args){
        //Membuat Instence/Objek dari Class restoran
        restoran data = new restoran();
        
        //Memasukan Data pada Variable
        data.setMenu("Ayam Goreng");
        data.setharga(20000.0);
        data.setSpesial(true);
        
        //Memanggil Method Get dari Class restoran dan Menampilkannya
        System.out.println("Menu Makanan: "+data.getMenu());
        System.out.println("Harga Makanan: Rp."+data.getHarga());
        System.out.println("Menu Spesial: "+data.getSpesial());
    }
}
