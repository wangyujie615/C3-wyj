import java.util.Scanner;

public class task4{
        public static void main(String[] args) {
            Scanner in=new Scanner(System.in);
            System.out.println("请输入数组的长度：");
            int len= in.nextInt();
            int[] num=new int[len];
            for(int i=0;i<len;i++)
            {
                System.out.println("输入的第"+(i+1)+"个元素：");
                num[i]= in.nextInt();
            }
            order(num);
        }
        public static void order(int[] num) {
            int n = num.length, left = 0, right = 0;
            while (left < n) {
                if (num[left] != 0) {
                    int temp = num[left];
                    num[left] = num[right];
                    num[right] = temp;
                    right++;
                }
                left++;
            }
            for(int a:num)
            {
                System.out.printf("%d\t",a);
            }
        }
}

