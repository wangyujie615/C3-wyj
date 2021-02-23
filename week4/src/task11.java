class Message{
    private String title;
    private String content;
    private  boolean flag=true;//标志位
    public synchronized void set(String title,String content)
    {
        if(flag==false)  //已经生产
        {
            try {
                super.wait();//暂停生产
            }catch (Exception e)
            {
                e.printStackTrace();
            }
        }
        this.title=title;
        try {
            Thread.sleep(100);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        this.content=content;
        this.flag=false;
        super.notify();//唤醒消费者拿走
    }
    public  synchronized void get()
    {
        if(flag==true)//未生产
        {
            try {
                super.wait();//等待生产者生产
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(100);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println(this.title+"-->"+this.content);
        this.flag=true;
        super.notify();//拿走后唤醒生产者生产
    }
}
class Producer implements Runnable {
    private Message msg=null;
    public Producer(Message msg)
    {
        this.msg=msg;
    }

    @Override
    public void run() {
        for(int i=0;i<50;i++)
        {
            if((i&1)==0)
            {
                this.msg.set("小明","JAVA菜鸡");
            }else
            {
                this.msg.set("麻婆豆腐","香麻爽口，十分下饭！");
            }
        }
    }
}
class Consumer implements  Runnable {
    private Message msg=null;
    public Consumer(Message msg)
    {
        this.msg=msg;
    }
    @Override
    public void run() {
        for(int i=0;i<50;i++)
        {
            this.msg.get();
        }
    }
}
public class task11 {
    public static void main(String[] args) {
        Message msg=new Message();
        new Thread(new Producer(msg)).start();
        new Thread(new Consumer(msg)).start();
    }
}
