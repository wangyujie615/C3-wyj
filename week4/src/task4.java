import java.util.Arrays;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("输入数组长度：");
        int length=in.nextInt();
        int[] num=new int[length];
        for(int i=0;i<length;i++)
        {
            num[i]=in.nextInt();
        }
        System.out.println("输入k值：");

        int k=in.nextInt();
        if(k>length)
        {
            System.out.println("超过数组长度");
        }
        Arrays.sort(num);
        System.out.println(num[k-1]);

    }
}
