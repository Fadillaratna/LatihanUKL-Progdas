package latihanukl;

public class Latihansol1 {

    public static void main(String[] args) {
        int nilaisukuPertama = 6;
        int beda = 8;
        int sukuAwal = 5;
        int sukuAkhir = 19;
        int total = 0;
        int sukuSaatIni;
        
        for(int i = sukuAwal; i<=sukuAkhir; i++){
            sukuSaatIni = nilaisukuPertama + (i-1)*beda;
            total += sukuSaatIni;
            System.out.println("Nilai suku ke-" + i + " : " + sukuSaatIni);
        }
        
            System.out.println("Total bilangan pada deret aritmatika = " + total);
           
    }

}
