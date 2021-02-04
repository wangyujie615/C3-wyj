class Vehicle{
    private int wheels;
    private double weights;
    public Vehicle(){}
    public Vehicle(int wheels,double weights){
        this.wheels=wheels;
        this.weights=weights;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWeights(double weights) {
        this.weights = weights;
    }

    public double getWeights() {
        return weights;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "wheels=" + wheels +
                ", weights=" + weights +
                '}';
    }
}
class Car extends Vehicle{
    private int v;
    private int loader;
    public Car(){}
    public Car(int wheels,double weights,int loader,int v){
        super(wheels,weights);
        this.loader=loader;
        this.v=v;
    }

    public void setLoader(int loader) {
        this.loader = loader;
    }

    public int getLoader() {
        return loader;
    }

    public void setV(int v) {
        this.v = v;
    }

    public int getV() {
        return v;
    }

    @Override
    public String toString() {
        String string=new String();
        if(this.loader>this.v)
        {
            string="\n这是一辆小车，能载"+this.v+"人，实载"+this.loader+"人,你超员了！！！";
        }
        else
        {
            string="\n这是一辆小车，能载"+this.v+"人，实载"+this.loader+"人";
        }
        return "车轮个数是:" +super.getWheels()+
                "  车重：" + super.getWeights() +string;

    }
}
class Truck extends Vehicle{
    private int v;//核载人数
    private int loader;//载了多少人
    private int playLoad;//载重量
    private int pw=5000;//核载重
    public Truck(){}
    public Truck(int wheels,double weights,int loader,int v,int playLoad){
        super(wheels,weights);
        this.loader=loader;
        this.v=v;
        this.playLoad=playLoad;

    }

    public void setLoader(int loader) {
        this.loader = loader;
    }

    public int getLoader() {
        return loader;
    }

    public void setV(int v) {
        this.v = v;
    }

    public int getV() {
        return v;
    }

    public void setPlayLoad(int playLoad) {
        this.playLoad = playLoad;
    }

    public int getPlayLoad() {
        return playLoad;
    }


    @Override
    public String toString() {
        String s=new String();
        String w=new String();
        if(this.loader>this.v)
        {
            s="\n这是一辆卡车，能载"+this.v+"人，实载"+this.loader+"人,你超员了！！！";
        }
        else
        {
            s="\n这是一辆卡车，能载"+this.v+"人，实载"+this.loader+"人";
        }
        if(this.playLoad>this.pw)
        {
            w="\n这是一辆卡车，核载"+this.pw+"Kg，你已经装载了"+this.playLoad+"Kg,你超载了！！！";
        }
        else
        {
            w="\n这是一辆卡车，核载"+this.pw+"Kg，你已经装载了"+this.playLoad+"Kg";
        }

        return "车轮个数是:" +super.getWheels()+
                "  车重：" + super.getWeights() +s+w;
    }
}
public class task6 {
    public static void main(String[] args) {
        Car c=new Car(4,1150.0,8,5);
        System.out.println(c);
        Truck t=new Truck(6,15000.0,1,3,7000);
        System.out.println(t);
    }
}
