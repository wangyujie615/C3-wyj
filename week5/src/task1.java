import java.util.*;

public class task1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num= in.nextInt();
        invert(num);
    }
    public static void invert(int num)
    {
        Queue<Integer> queue=new LinkedList<>();
        int temp=num,k=0;
        while(temp%10!=0||temp/10!=0)
        {
            queue.add(temp%10);
            temp/=10;
        }
        while(!queue.isEmpty())
        {
                k = k * 10 + queue.peek();
                queue.poll();
        }
        if(k>=-231&&k<=230)
        {
            System.out.println(k);
        }
        else
        {
            System.out.println(0);
        }


    }
}
