import java.util.Scanner;

public class Task3 {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        System.out.println(contraryString(str));

    }
    public static String contraryString(String str)
    {
        char[] c=str.toCharArray();
        char[] n=new char[c.length];
        for(int i=0;i<c.length;i++)
        {

            n[i]=c[c.length-1-i];
        }
        return new String(n);

    }

}
