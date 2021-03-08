import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("输入数组长度");
        int length=in.nextInt();
        System.out.println("输入数组元素");
        int[] num=new int[length];
        for(int i=0;i<length;i++)
        {
            num[i]=in.nextInt();
        }
        List<List<Integer>> list=findNum(num);
        System.out.println(list);

    }
    public static List<List<Integer>> findNum(int[] num)
    {
        List<List<Integer>> list=new ArrayList<>();
        list.add(new ArrayList<>());//添加空集
        for(int i=0;i<num.length;i++)
        {
           for(int j=0;j<list.size();j++)
           {
               List<Integer> m=new ArrayList<>(list.get(j));
               if(!m.contains(num[i]))
               {
                   m.add(num[i]);
                   list.add(m);
               }
               else
               {
                   continue;
               }
           }
        }
        return list;
        }
}

