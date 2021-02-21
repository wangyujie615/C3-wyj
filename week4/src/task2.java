import java.util.*;

public class task2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        findNum(str);
    }
    public static void findNum(String str)
    {
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<str.length();i++) {
            char alpha = str.charAt(i);
            if (!map.containsKey(alpha)) {
                map.put(alpha, i);//若是未重复字符则将字符与索引放入map中
            } else {
                map.replace(alpha,Integer.MAX_VALUE);//若为重复字符则修改Value
            }
        }
        Collection<Integer> l= map.values();
        Object[] m=l.toArray();
        Arrays.sort(m);//对数组进行排序 找到最小的索引
        if((int)m[0]==Integer.MAX_VALUE)
        {
            System.out.println("全为重复字符");
        }
        else
        {
            System.out.println(m[0]);
        }
    }
}
