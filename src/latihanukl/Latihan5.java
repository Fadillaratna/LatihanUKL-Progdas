package latihanukl;

import java.*;
import java.util.Scanner;

public class Latihan5 {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        
        int id [] = {1, 2, 3, 4};
        String nama [] = {"Mira", "Nina", "Oemar", "Pena"};
        String jalur [] = {"SBMPTN", "SNMPTN", "Mandiri", "SBMPTN"};
        String alamat [] = {"Sawojajar", "Kedung Kandang", "Ijen", "Dinoyo"};
        char kategori = 'A';
        int spp = 0;
        int dsp = 0;
        
        System.out.print("Input ID Mahasiswa : ");
        int inputId = a.nextInt();
        
        System.out.print("Input Pendapatan Orang Tua : ");
        int pendapatan = a.nextInt();
        
        System.out.print("Jumlah Bulan Tunggakan : ");    
        int bulan = a.nextInt();
        
        switch(jalur[inputId-1]){
            case "SBMPTN":
                if(pendapatan < 2000000){
                    kategori = 'A';
                    dsp = 5000000;
                    spp = 500000;
                }else if(pendapatan > 10000000){
                    kategori = 'C';
                    dsp = 30000000;
                    spp = 2000000;
                }else {
                    kategori = 'B';
                    dsp = 15000000;
                    spp = 1000000;
                }
            break;
            
            case "SNMPTN":
                if(pendapatan < 2000000){
                    kategori = 'A';
                    dsp = 7000000;
                    spp = 500000;
                }else if(pendapatan >10000000){
                   kategori = 'C';
                    dsp = 35000000;
                    spp = 2000000;
                }else {
                     kategori = 'B';
                    dsp = 17000000;
                    spp = 1000000;
                }
            break;
            
            case "Mandiri":
                if(pendapatan < 2000000){
                    kategori = 'A';
                    dsp = 10000000;
                    spp = 1000000;
                }else if(pendapatan > 10000000){
                    kategori = 'B';
                    dsp = 25000000;
                    spp = 2000000;
                }else {
                    kategori = 'C';
                    dsp = 50000000;
                    spp = 3000000;
                }
            break;
        }
        
        int pembayaran = bulan * spp;
        
        System.out.println("\n ====================== Print Tagihan Universitas =============================");
        System.out.println("ID Mahasiswa : " + inputId);
        System.out.println("Nama Mahasiswa : " + nama[inputId - 1]);
        System.out.println("Jalur Masuk Universitas : " + jalur[inputId - 1]);
        System.out.println("Alamat : " + alamat[inputId - 1]);
        System.out.println("Pendapatan Orang Tua : Rp" + pendapatan + ",-");
        System.out.println("Kategori Pendapatan : " + kategori);
        System.out.println("Jumlah Bulan Penunggakan SPP : " + bulan);
        System.out.println("Biaya SPP : Rp" + spp + ",-/bulan");
        System.out.println("Tagihan SPP yang harus dibayar : Rp" + pembayaran + ",-");
        System.out.println("Tagihan DSP : Rp" + dsp + ",-");
    }
    
}
