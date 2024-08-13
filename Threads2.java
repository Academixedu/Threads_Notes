public class Threads2 extends Thread {
    public void run(){
        for(int i=1;i<=2;i++){
            System.out.println("Hello"+Thread.currentThread().getName());
        }
    }
    public static void main(String[] args) {
        Threads2 t=new Threads2();
        t.start();
        t.yield();
        Threads2 t1=new Threads2();
        t1.start();
    }
}
