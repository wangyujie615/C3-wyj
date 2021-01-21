import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args)
    {
        ArrayList<Integer> k=new ArrayList<Integer>();
        k=waterFlower(100,1000);
        for(int i=0;i<k.size();i++)
        {
            int b=k.get(i);
            System.out.println(b);
        }
    }
    public static ArrayList<Integer> waterFlower(int low,int high)
    {
        ArrayList<Integer> k=new ArrayList<Integer>();
        for(int i=low;i<high;i++)
        {
            int a=i/100;
            int b=(i/10)%10;
            int c=i%10;
            double temp=Math.pow(a,3)+Math.pow(b,3)+Math.pow(c,3);
            if(i==temp) {
                k.add(i);
            }
        }
        return k;
    }
}
