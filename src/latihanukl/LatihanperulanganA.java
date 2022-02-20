package latihanukl;

public class LatihanperulanganA {

    public static void main(String[] args) {
        int nilaiSukuPertama = 6;
        int beda = 8;
        int sukuAwal = 5;
        int sukuSaatIni;
        int total = 0;
        
        for(int i = 1; i <=4; i++){
            for(int j = 1;  j<=i; j++ ){
                sukuSaatIni = nilaiSukuPertama + (sukuAwal - 1)*beda;
                nilaiSukuPertama += beda;
                total += sukuSaatIni;
                System.out.print( sukuSaatIni + "\t");
            }
                System.out.println("");
        }
        
        for(int m = 1; m <=3; m++ ){
            for(int n = 3; n >=m; n--){
                sukuSaatIni = nilaiSukuPertama + (sukuAwal - 1)*beda;
                nilaiSukuPertama += beda;
                total += sukuSaatIni;
                System.out.print( sukuSaatIni + " \t");
            }
                System.out.println("");
        }
        
        System.out.println("Total seluruh bilangan pada deret aritmatika = " + total);
    }

}
