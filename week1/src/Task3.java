import java.util.Scanner;

public class Task3 {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int num= in.nextInt();
        if(confirm(num)){
            System.out.println(num+"可以被3，5，7整除");
        }
        else{
            System.out.println(num+"不可以被3，5，7整除");
        }
    }
    public static  boolean confirm(int k)
    {
        if(k%3==0&&k%5==0&&k%7==0)
        {
            return true;
        }
        else{
            return false;
        }

    }
}
