import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("输入体重(kg)：");
        double weight=in.nextDouble();
        System.out.println("输入身高(m)：");
        double height=in.nextDouble();
        BMI(weight,height);
    }
    public static void BMI(double weight,double height)
    {
        double bmi=weight/Math.pow(height,2);
        if(bmi<18.5){
            System.out.println("过轻");
        }else if(bmi>=18.5&&bmi<25)
        {
            System.out.println("正常");
        }else if(bmi>=25&&bmi<28)
        {
            System.out.println("过重");
        }else if(bmi>=28&&bmi<32)
        {
            System.out.println("肥胖");
        }else if(bmi>=32)
        {
            System.out.println("非常肥胖");
        }


    }
}
