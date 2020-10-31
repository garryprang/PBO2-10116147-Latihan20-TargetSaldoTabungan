/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116147.latihan20.targetsaldotabungan;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 * @author
 * Nama                 : Garry Prang
 * NIM                  : 10116147
 * Kelas                : PBO-2
 * Deskripsi Program    : Program untuk menghitung target saldo tabungan.
 */

public class PBO210116147Latihan20TargetSaldoTabungan {
        public static void tampilSaldo(double saldoAwal,int bunga,int lamaBulan){
        int i = 1;
        double saldoSemt = saldoAwal;
        double targetSaldo = 6000000;
             
        DecimalFormat kursID = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        
        formatRp.setCurrencySymbol("Rp");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        kursID.setDecimalFormatSymbols(formatRp);
       
        while(saldoSemt < targetSaldo){
            System.out.println("Saldo di bulan ke-" + i + ": " + kursID.format(saldoSemt = saldoSemt + (saldoSemt *bunga/100)));
            i++;
        }    
    } 
    public static void main(String[] args) {
        double saldoAwal;
        int bunga, lamaBulan;
        saldoAwal = 3500000;
        bunga = 8;
        lamaBulan = 6;       
        tampilSaldo(saldoAwal,bunga,lamaBulan);
    }
    
}
