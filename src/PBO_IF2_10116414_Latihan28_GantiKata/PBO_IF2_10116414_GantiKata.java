/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO_IF2_10116414_Latihan28_GantiKata;
import java.util.Scanner;
/**
 *
 * @author sweenutt
 * NAMA         : FAEL ANTONI WIJAYA
 * KELAS        : PBO-2
 * NIM          : 10116414
 * DESKRIPSI    : Program Ganti Kata
 */
public class PBO_IF2_10116414_GantiKata {
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        String text, cari, ganti;
        System.out.println("====Program Mengganti Kata===");
        System.out.print("\nMasukkan Kalimat : ");
        text = in.nextLine();
        System.out.print("Gant Kata : ");
        cari = in.nextLine();
        System.out.print("Menjadi : ");
        ganti = in.nextLine();
        System.out.println("\n====Hasil Formatting===");
        System.out.print("Kalimat Awal : "+(text));
        System.out.println("\nKalimat Baru : "+text.replace(cari, ganti));
    }
    
}
