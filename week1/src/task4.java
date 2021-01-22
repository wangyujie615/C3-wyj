public class task4 {
    public static void main(String[] args) {
        System.out.println(SumA(100,200));
        System.out.println(SumB(100,200));
        System.out.println(SumC(100,200));
    }
    public static int SumA(int a,int b)
    {
        int sum=0;
        while(a<=b)
        {
            sum+=a;
            a++;
        }
        return sum;
    }
    public static int SumB(int a,int b)
    {
        int sum=0;
        for(int i=a;i<=b;i++)
        {
            sum+=i;
        }
        return sum;
    }
    public static int SumC(int a,int b)
    {
        int sum=0;
       do{
          sum+=a;
          a++;
       }while(a<=b);
        return sum;
    }
}
