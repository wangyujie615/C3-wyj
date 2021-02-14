import java.util.*;

public class task4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        countChar(str);
    }
    public static void countChar(String str)
    {
        char[] s=str.toCharArray();
        Map<Character,Integer> m=new HashMap<>();
        int j=0;
        for (int i=0;i<s.length;i++)
        {
            if(m.get(s[i])!=null)
            {
                j=m.get(s[i]);
            }
            else
            {
                j=0;
            }
            m.put(s[i], j+1);
        }
        Set<Map.Entry<Character,Integer>> set=m.entrySet();
        Iterator<Map.Entry<Character,Integer>> iter= set.iterator();
        while(iter.hasNext())
        {
            Map.Entry<Character,Integer> map=iter.next();
            System.out.println(map.getKey()+":"+map.getValue());
        }
    }
}
