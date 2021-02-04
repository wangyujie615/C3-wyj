import java.util.Locale;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("输入字符串数组的长度：");
        String[] str=new String[in.nextInt()];
        System.out.println("输入字符串：");
        for(int i=0;i< str.length;i++)
        {
            str[i]=in.next();
        }
        String k=maxLong(str);
        System.out.println(k);

    }
    public static String maxLong(String[] str)
    {
        if(str==null||str.length==0)
        {
            return "";
        }
        String max_before=new String();
        int length=str[0].length();
        for(int i=1;i< str.length;i++)
        {
            for(int j=0;j<length;j++)
            {
                max_before=str[0].substring(0,j+1);
                if(!str[i].startsWith(max_before))
                {
                    max_before=str[0].substring(0,j);
                    length=max_before.length();
                    break;
                }
            }
            if(length==0) return "";
        }
       return max_before;

    }
}
