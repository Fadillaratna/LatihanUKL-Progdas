package latihanukl;

public class PerkalianArray {
    
    public static void main(String[] args) {
       int [] [] mA = {{2, 6}, {5, 3}};
       int [] [] mB = {{2}, {3}};
       
       int mAB [] [] = new int [mA.length] [mB[0].length];
       
       for(int h = 0; h < mA.length; h++){
           for(int i = 0; i < mB[0].length; i++){
               for(int j = 0; j <mB.length; j++){
                   mAB [h] [i] += mA[h] [j] * mB [j][i];
               }
               System.out.print(mAB [h][i] + "  ");
           }
               System.out.println("");
       }
       
      
        System.out.println("\n");
       
       int mC [] [] = {{2, 5}, {3, 3}}; 
       int mD [] [] = {{1, 3}, {5, 4}}; 
       
       int hasilTambah [] [] = new int [mC.length] [mD.length];
       
       for(int a = 0; a < mC.length; a++){
           for(int b = 0; b < mD.length; b++){
               hasilTambah[a] [b] = mC[a][b] +  mD[a][b];
               System.out.print(hasilTambah[a] [b] + "\t");
           }
              System.out.println("");
       }
       
               
    }
    
}
