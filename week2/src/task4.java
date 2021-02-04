import java.util.Scanner;

class Game
{
    private int v=100;
    public Game(){}
    public int guess(int num){
       if(num>v){
           System.out.println("猜大了噢，再试一下吧！");
           return 0;
       }else if(num==v){
           System.out.println("恭喜你，猜对了！");
           return 1;
       }else
       {
           System.out.println("猜的有点小，再试一下吧！");
           return 0;
       }
    }
}
public class task4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Game temp=new Game();
        int k;
        System.out.println("欢迎来到猜字游戏，请输入一个数：");
        do {
            int v=in.nextInt();
            k= temp.guess(v);
        }while(k!=1);
    }
}
