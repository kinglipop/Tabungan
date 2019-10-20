/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118904.latihan42.tabungan;

/**
 *
 * @author Firman Alfinas
 */
public class Tabungan {
    private int saldo;

//    public int getSaldo() {
//        return saldo;
//    }
//
//    public void setSaldo(int saldo) {
//        this.saldo = saldo;
//    }
    
    public Tabungan(int saldo){
        this.saldo = saldo;
        System.out.print("Saldo anda Sekarang : " + saldo +"\n");
    } 
    
    public int ambilUang(int jumlah){
        jumlah = saldo - jumlah;
        return jumlah;
    }
}
