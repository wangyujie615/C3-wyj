interface Usb{
    public void turnOn();
    public void turnOff();
}
class Mouse implements Usb{
    @Override
    public void turnOn() {
        System.out.println("鼠标启动了");
    }

    @Override
    public void turnOff() {
        System.out.println("鼠标关闭了");
    }
}
class Keyboard implements Usb{
    @Override
    public void turnOn() {
        System.out.println("键盘启动了");
    }

    @Override
    public void turnOff() {
        System.out.println("键盘关闭了");
    }
}
class Mcophone implements Usb{
    @Override
    public void turnOn() {
        System.out.println("麦克风启动了");
    }

    @Override
    public void turnOff() {
        System.out.println("麦克风关闭了");
    }
}
class Computer{
    public Usb[] u=new Usb[3];
    public static int temp=0;
    public void add(Usb usb)
    {
        u[temp]=usb;
        temp++;
    }
    public void powerOn()
    {
        for(int i=0;i<u.length;i++)
        {
            if(u[i]!=null)
            {
                u[i].turnOn();
            }
        }
        System.out.println("电脑启动了");
    }
    public void powerOff()
    {
        for(int i=0;i<u.length;i++)
        {
            if(u[i]!=null)
            {
                u[i].turnOff();
            }
        }
        System.out.println("电脑关机");
    }

}
public class task10 {
    public static void main(String[] args) {
        Computer c=new Computer();
        c.add(new Mouse());
        c.add(new Keyboard());
        c.add(new Mcophone());
        c.powerOn();
        c.powerOff();
    }
}
