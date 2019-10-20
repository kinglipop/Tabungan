/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118904.latihan42.tabungan;
import java.util.*;
/**
 *
 * @author Firman Alfinas
 * Nama     : Firman Alfinas
 * Kelas    : IF 11-K
 * Nim      : 10118904
 * Deskripsi Program : Program ini berisi program untuk menghitung tabungan
 */
public class PBO11K10118904Latihan42Tabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Scanner = new Scanner(System.in);
        
        
        System.out.print("Masukan Saldo Awal : ");
        int i = Scanner.nextInt();
        Tabungan t = new Tabungan(i);
        System.out.print("Jumlah uang yang diambil : ");
        int ambil = Scanner.nextInt();
        System.out.println("Sisa Tabungan anda : "+ t.ambilUang(ambil));
        
        
        
    }
    
}
