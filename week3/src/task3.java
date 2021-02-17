import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class task3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        System.out.println(startString(str));

    }
    public static String startString(String str)
    {
        Set<Character> s=new TreeSet<>();//有序选用TreeSet
        for (int i=0;i<str.length();i++)
        {
            char alpha=str.charAt(i);
            s.add(alpha);
        }
        Object[] m=s.toArray();
        char[] t=new char[s.size()];
        for(int i=0;i<s.size();i++)
        {
            t[i]=(char) m[i];
        }
        String p=new String(t);
        return p;
    }
}
