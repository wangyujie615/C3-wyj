import java.util.Scanner;
import java.util.Stack;

public class task6 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Stack<String> stack=new Stack<>();
        System.out.println("输入数组长度：");
        int n=in.nextInt();
        String[] str=new String[n];
        for(int i=0;i<n;i++)
        {
            str[i]=in.next();

        }
        System.out.println(findStack(str));
    }
    public static boolean findStack(String[] str)
    {
        Stack<String> stack=new Stack<>();
        for(int i=0;i<str.length;i++)
        {
            if(stack.isEmpty())
            {
                stack.push(str[i]);
            }
            else{
                String p = stack.peek();//获取栈顶元素
                if ((p.equals("(") && str[i].equals(")")) || (p.equals("[") && str[i].equals("]")) || (p.equals("{") && str[i].equals("}"))) {
                    stack.pop();//遇到“）” “】” “}”则出栈
                } else {
                    stack.push(str[i]);
                }
            }
        }
        if(stack.isEmpty())
        {
            return  true;
        }else
        {
            return false;
        }

    }
}
