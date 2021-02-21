import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("请输入字符串：");
        String str=in.nextLine();
        System.out.println("请输入子字符串：");
        String s=in.nextLine();
        if(str.indexOf(s)==-1)
        {
            System.out.println("不包含该子字符串");
        }else
        {
            System.out.println(str.indexOf(s));
        }

    }

}
