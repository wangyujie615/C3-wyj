import java.util.Scanner;

class MyMath
{
    public static double div(double x,double y) throws Exception{
        double result=0;
        try {
            result=x/y;
        }catch (Exception e)
        {
            throw e;
        }finally {
            System.out.println("计算结束");
        }
        return result;
    }
}
public class task5 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double x=in.nextDouble();
        double y=in.nextDouble();
        try {
            System.out.println(MyMath.div(x,y));
        }catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
