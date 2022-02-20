package latihanukl;

public class Latihan {

    public static void main(String[] args) {
       int awal = 5;
       int beda = 3;
       int total = 0;
       int sukuSaatIni = 0;
      
       for(int i = 1; i <=5; i++){
           for(int j = 1; j <= i; j++ ){
               sukuSaatIni = awal;
               System.out.print( sukuSaatIni + "\t" );
               awal += beda;
               total += sukuSaatIni;
           }
            System.out.println("");
       }
       
        System.out.println("Total Deret Bilangan = " + total);
    }
    
}
