/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classobject;

/**
 *
 * @author windows x
 */
public class hewan {
    int jumlahKaki= 0;
    String namahewan= "";
    
    public hewan(String nama,int kaki){
    this.jumlahKaki = kaki;
    this.namahewan = nama;
    }
    
    public void info(){
    System.out.println("Nama Hewan : "+this.namahewan + ", Kaki : "+this.jumlahKaki);
    }
}
