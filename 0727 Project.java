import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {    
        int[][] num = {{1,2},{4,5},{7,8},{10,11}};
        int[][] ary = new int[4][2];

        for(int i = 0; i < num.length; i++){
            for(int j = 0; j < num[i].length; j++){
                ary[i][j] = num[i][j];
                System.out.print(ary[i][j]+" ");
            }
            System.out.println();
        }
    }
}