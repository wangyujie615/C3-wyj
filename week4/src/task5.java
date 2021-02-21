import java.util.*;

public class task5 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("输入数组长度：");
        int length=in.nextInt();
        int[] num=new int[length];
        for(int i=0;i<length;i++)
        {
            num[i]=in.nextInt();
        }
        findNumMax(num);
    }
    public  static void findNumMax(int[] num)
    {
        Map<Integer,Integer> map=new HashMap<>();
        int max=0,key=Integer.MIN_VALUE
        for(int i=0;i<num.length;i++)
        {
            int s=num[i];
            if(!map.containsKey(s))
            {
                map.put(s,1);
            }else
            {
                map.replace(s,map.get(s)+1);//统计出现的次数
            }
        }
        Set<Map.Entry<Integer,Integer>> set=map.entrySet();
        Iterator<Map.Entry<Integer,Integer>> it= set.iterator();
        while (it.hasNext())
        {
            Map.Entry<Integer,Integer> me=it.next();
            if(max<me.getValue())//找到次数最多的
            {
                max=me.getValue();
                key=me.getKey();
            }
            if(max==1)
            {
                key=-1;
            }
        }
        System.out.println(key);
    }
}
