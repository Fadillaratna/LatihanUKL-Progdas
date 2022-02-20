package latihanukl;

public class Latihan4 {

    public static void main(String[] args) {
       int nilaiSukuPertama = 6;
       int beda = 8;
       int sukuAwal = 5;
       int sukuSaatIni;
       int total = 0;
       
       for(int i = 1; i <= 4; i++){
           for(int j = 4; j >= i; j--){
               sukuSaatIni = nilaiSukuPertama + (sukuAwal - 1) * beda;
               nilaiSukuPertama += beda;
               total += sukuSaatIni;
               System.out.print("\t" + sukuSaatIni + "  ");
           }
           System.out.println("");
       }
       
       for(int a = 1; a<=3; a++){
           for(int b = 0; b <=a; b++){
               sukuSaatIni = nilaiSukuPertama + (sukuAwal - 1) * beda;
               nilaiSukuPertama += beda;
               total += sukuSaatIni;
               System.out.print("\t"+ sukuSaatIni + "  ");
           }
           System.out.println("");
       }
       
        System.out.println("Total seluruh bilangan pada deret aritmatika = "  + total);
               
    }
    
}
