import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println(solution(n)+"种方案");
    }
    public static int solution(int num)
    {
        if(num==1||num==2||num==3)
        {
            return num;
        }
        else
        {
            return solution(num-1)+solution(num-2);
        }
    }
}
