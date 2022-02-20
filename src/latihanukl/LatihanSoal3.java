package latihanukl;

public class LatihanSoal3 {

    public static void main(String[] args) {
        int awal = 6;
        int beda = 8;
        int n = 5;
        int sukuSaatIni;
        int total = 0;

        for (int i = 1; i <= 3; i++) {
            for (int k = 1; k <= i; k++) {
                sukuSaatIni = awal + (5 - 1) * beda;
                System.out.print(sukuSaatIni + "   ");
                awal += beda;
                total += sukuSaatIni;
            }
            System.out.println(" ");
        }
            System.out.println("Jumlah seluruh deret bilangan = " + total);

    }

}
