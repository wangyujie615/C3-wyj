import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        int[][] m = {{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};
        int[][] n = new int[4][4];
        order(n,m,m.length);
    }
    public static void order(int[][] n,int[][] m,int t)
    {
        for (int i = 0; i < t; i++)
        {
            for(int j=0;j<t;j++)
            {
                n[j][t-i-1]=m[i][j];
            }
        }
        for (int i = 0; i < 4; i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(n[i][j]+" ");
            }
            System.out.println();
        }
    }
}
