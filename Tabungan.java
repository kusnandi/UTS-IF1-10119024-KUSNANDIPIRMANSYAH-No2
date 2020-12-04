/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if1.pkg10119024.kusnandipirmansyah.no2;

/**
 *
 * @author acer
 * KUSNANDI PIRMANSYAH
 * IF1
 * 10119024
 */
public class Tabungan {
    private int saldo;
    public Tabungan(int saldo){
        this.saldo = saldo;
    }

    public int ambilTabungan(int jumlah){
        return saldo - jumlah;
    }
    
}
