abstract class A{
    private int numA=10;
    public abstract void showA();

    public void setNumA(int numA) {
        this.numA = numA;
    }

    public int getNumA() {
        return numA;
    }
}
abstract class B extends A{
    private int numB=20;
    public abstract void showB();

    public void setNumB(int numB) {
        this.numB = numB;
    }

    public int getNumB() {
        return numB;
    }
}
class C extends B {
    private int numC = 30;

    @Override
    public void showA() {
        System.out.println("A类中的numA:"+super.getNumA());
    }

    public void showB()
    {
        System.out.println("B类中的numB:"+super.getNumB());
    }
    public void showC()
    {
        System.out.println("C类中的numC:"+numC);
    }
}
public class task8 {
    public static void main(String[] args) {
        C c=new C();
        c.showA();
        c.showB();
        c.showC();
    }
}
