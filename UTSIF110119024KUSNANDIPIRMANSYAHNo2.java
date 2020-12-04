/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if1.pkg10119024.kusnandipirmansyah.no2;

import java.util.Scanner;

/**
 *
 * @author acer
 * KUSNANDI PIRMANSYAH
 * IF1
 * 10119024
 */
public class UTSIF110119024KUSNANDIPIRMANSYAHNo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("====Program Penarikan Saldo====");
        System.out.print("Masukkan saldo awal : ");
        Tabungan tabungan = new Tabungan(scan.nextInt());
        System.out.print("Jumlah uang yang diambil : ");
        int sisaSaldo = tabungan.ambilTabungan(scan.nextInt());
        System.out.println("Saldo Anda Sekarang : "+sisaSaldo);
    }
    
}
