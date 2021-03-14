import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println(solution(n)+"种方案");
    }
    public static int solution(int num)
    {
        int[] memory=new int[num+1];
        memory[1]=1;
        memory[2]=2;
        for(int i=3;i<=num;i++)
        {
            memory[i]=memory[i-1]+memory[i-2];
        }
        return memory[num];
    }
}
