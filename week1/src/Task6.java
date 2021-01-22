class Bank{
    private String name;
    private float money;
    public Bank(){}
    public Bank(String name,float money)
    {
        this.name=name;
        this.money=money;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    public float getMoney() {
        return money;
    }
}
public class Task6 {
    public static void main(String[] args) {
        Bank b=new Bank("小明",1000);
        System.out.println("余额为："+b.getMoney());
    }
}
