public class RunnableDemo implements Runnable{

    @Override
    public synchronized void run() {
        for(int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
    public static void main(String[] args) {
        RunnableDemo de=new RunnableDemo();
        Thread t=new Thread(de);
        t.start();
        Thread t1=new Thread(de);
        t1.start();
    }
    
}
