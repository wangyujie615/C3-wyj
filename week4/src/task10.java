class MyThread implements Runnable{
    private int count=0;
    private static final Object obj=new Object();
    @Override
    public void run() {
        while (count<=10)
        {
            synchronized (obj)
            {
                System.out.println(Thread.currentThread().getName()+":"+this.count++);
                obj.notify();//唤醒下一个进程
                if(count<=10)
                {
                   try {
                       obj.wait();//该进程等待
                   }catch (Exception e)
                   {
                       e.printStackTrace();
                   }
                }
            }
        }
    }
}
 class task10 {
    public static void main(String[] args) {
        MyThread myThread=new MyThread();
        new Thread(myThread,"线程A").start();
        new Thread(myThread,"线程B").start();

    }
}
