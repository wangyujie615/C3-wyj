class Animal{
    private double height;
    private double weight;

    public Animal(double height,double weight){
        this.height=height;
        this.weight=weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void eat()
    {}
    public void sleep(){
        System.out.println("动物晚上都要睡觉！");
    }
}
class Rabbit extends Animal{//子类默认调用父类的无参构造（如果有）
    public Rabbit(double height,double weight){
        super(height,weight);
    }

    public void eat(boolean grass)
    {
        if(grass)
        {
            System.out.println("兔子是吃草的！");
        }
    }
}
class Tiger extends Animal{
    public Tiger(double height,double weight){
        super(height,weight);
    }

    public void eat(boolean grass)
    {
        if(!grass)
        {
            System.out.println("老虎是吃肉的！");
        }
    }
}
public class Task8 {
    public static void main(String[] args) {
       Rabbit r=new Rabbit(20,30);
       Tiger t=new Tiger(70,50);
       r.eat(true);
       t.eat(false);
       r.sleep();
       t.sleep();



    }
}
