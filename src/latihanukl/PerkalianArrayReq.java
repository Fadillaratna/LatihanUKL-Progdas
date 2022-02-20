package latihanukl;

public class PerkalianArrayReq {

    public static void main(String[] args) {
        int [] [] mA = {{-1, 2, 5, 6}, {3, 4, 1, 2}, {7, 5, 2, 1}, {4, 5, 6, 7}};
        int [] [] mB = {{6, -7, 1, 3}, {2, 1, 4, 5}, {6, 7, 8, 9}, {1, 2, 3, 4}};
        
        int [] [] mAB = new int [mA.length] [mB[0].length];
        int [] [] hasilAB = new int [mA.length] [mB.length];
        
        for(int y = 0; y < mA.length; y++){
            for(int z = 0; z < mB.length; z++){
                hasilAB [y] [z] = mA[y][z] * mB[y][z];
                System.out.print(hasilAB[y][z] + "  " );
            }
            System.out.println("");
        }
        
        System.out.println("");
        
        for(int a = 0; a < mA.length; a++){
            for(int b = 0; b < mB[0].length; b++){
                for(int c = 0; c < mB.length; c++ ){
                    mAB [a] [b] += mA[a] [c] * mB[c][b];
                }
                System.out.print(mAB [a] [b] + "  ");
            }
                System.out.println("");
        }
        
        
        System.out.println("\n");
        int mC [] [] = {{-2, 6, 3}, {7, 5, 4}};
        int mD [] [] = {{1, 2}, {3, 4}};
        
         int [] [] mCD= new int [mC.length] [mD[0].length];
        
        for(int m = 0; m < mC.length ; m++){
            for(int n = 0; n <mD[0].length; n++){
                for(int k = 0; k < mD.length; k++ ){
                    mCD [m] [n] += mC[m] [k] * mD[k] [n];
                }
                System.out.print(mCD [m] [n]+"   " );
            }
            System.out.println("");
        }
    }
    
}
