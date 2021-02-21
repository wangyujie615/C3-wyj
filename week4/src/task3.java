import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double f=in.nextDouble();
        double num=1;
        do {
            f=f*10;
            num=num*10;
        }while (f%1!=0);//化为整数

        for(int i=2;i<=10;i++)
        {
            if(f%i==0&&num%i==0)
            {
                f=f/i;
                num=num/i;//消去公因子
            }
        }
        System.out.println(f+"/"+num);
    }
}
