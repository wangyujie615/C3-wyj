import java.nio.charset.StandardCharsets;
import java.sql.Array;
import java.util.*;

public class task7 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int l=in.nextInt();
        String[] str=new String[l];
        for(int i=0;i<l;i++)
        {
            str[i]=in.next();
        }
        findSame(str);
    }
    public static void  findSame(String[] str)
    {
        Map<String, List<String>> map=new HashMap<>();
        for(int i=0;i< str.length;i++)
        {
            char[] m=str[i].toCharArray();
            Arrays.sort(m);//字符串排序
            String p=new String(m);
            if(!map.containsKey(p))
            {
                List<String> list=new ArrayList<>();
                list.add(str[i]);
                map.put(p,list);
            }
            else
            {
                List<String> list=map.get(p);
                list.add(str[i]);
                map.replace(p,list);
            }
        }
        System.out.println(map);
    }
}
