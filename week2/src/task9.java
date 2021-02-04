interface Universe{
    public abstract void doAnything();
}
class Star{
    public void shine(){
        System.out.println("star:星星一闪一闪亮晶晶");
        System.out.println("===================");
    }
}
class Sun extends Star implements Universe{
    @Override
    public void doAnything() {
        System.out.println("star:星星一闪一闪亮晶晶");
        System.out.println("===================");
    }

    @Override
    public void shine() {
        System.out.println("sun:太阳吸引着9大行星转");
        System.out.println("sun:光照8分钟，到达地球");
    }
}
public class task9 {
    public static void main(String[] args) {
        Universe s=new Sun();//向上转型
        s.doAnything();
        Sun t=(Sun)s;//向下转型
        t.shine();

    }
}
