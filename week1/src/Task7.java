class Complex{
    private float a;
    private float b;
    public Complex(){}
    public Complex(float a,float b){
        this.a=a;
        this.b=b;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getA() {
        return a;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getB() {
        return b;
    }

    public Complex add(Complex a){
        return new Complex(this.a+a.getA(),this.b+a.getB());
    }

    public Complex reduce(Complex a)
    {
        return new Complex(this.a-a.getA(),this.b-a.getB());
    }

    public Complex multiply(Complex a)
    {
        return new Complex(this.a*a.getA()-this.b*a.getB(),this.a*a.getB()+this.b*a.getA());
    }
}
public class Task7 {
    public static void main(String[] args) {
        Complex a=new Complex(2,3);
        Complex b=new Complex(1,2);
        Complex c=a.add(b);
        Complex d=a.reduce(b);
        Complex e=a.multiply(b);
        System.out.println(c.getA()+"+"+c.getB()+"i");
        System.out.println(d.getA()+"+"+d.getB()+"i");
        System.out.println(e.getA()+"+"+e.getB()+"i");

    }
}
