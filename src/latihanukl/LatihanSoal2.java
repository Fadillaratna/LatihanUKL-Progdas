package latihanukl;

public class LatihanSoal2 {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
       
        System.out.println("Matriks 5 x 3 \n");
        
        int nilaiSukuPertama = 6;
        int beda = 8;
        int sukuAwal = 5;
        int total = 0;
        int sukuSaatIni;
        
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= 3; j++){
                sukuSaatIni = nilaiSukuPertama + (sukuAwal - 1)*beda;
                nilaiSukuPertama += beda;
                total += sukuSaatIni;
                System.out.print(sukuSaatIni + "   ");
            }
                System.out.println("");
        }
            System.out.println("Total bilangan pada deret aritmatika = " + total);
    }
    }
    

