import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("请输入数组的长度：");
        int len= in.nextInt();
        int[] num=new int[len];
        for(int i=0;i<len;i++)
        {
            System.out.println("输入的第"+(i+1)+"个元素：");
            num[i]= in.nextInt();
        }
        order(num);
    }
    public static void order(int[] num)
    {
        for(int i=0;i<num.length;i++)
        {
            if(num[i]==0)
            {
                int temp=num[i];
                for(int j=i;j<num.length-1;j++)
                {
                    num[j]=num[j+1];
                }
                num[num.length-1]=temp;
            }
        }
        for(int a:num)
        {
            System.out.print(a);
            System.out.print("\t");
        }
    }

}
