public class ThreadDemo extends Thread{
   @Override
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
    public static void main(String[] args) {
        ThreadDemo t=new ThreadDemo();
        t.start();
        ThreadDemo t1=new ThreadDemo();
        t1.start();
    }
}
