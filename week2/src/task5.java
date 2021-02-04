class Monkey{
    private String s;
    public Monkey(){}
    public Monkey(String s)
    {
        this.s=s;
    }
    public void speak()
    {
        System.out.println("咿咿呀呀~~~~");
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }
}
class People extends Monkey{
    private String s;
    public People(String s){
        super(s);//调用父类带参数的构造方法
    }

    @Override
    public void speak() {
        System.out.println("小样的，不错嘛！会说话了！");
    }
    public void think()
    {
        System.out.println("别说话，认真思考！");
    }
}
public class task5 {
    public static void main(String[] args) {
        Monkey m=new Monkey("猴子");
        People p=new People("人");
        System.out.println(m.getS());
        m.speak();
        System.out.println(p.getS());
        p.speak();
        p.think();

    }
}
