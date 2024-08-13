public class Threads1 implements Runnable{

    public void run(){
        for(int i=0;i<4;i++){
            try {
                Thread.sleep(100);
                System.out.println("Hello "+Thread.currentThread().getName());
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }    
            
                    }
    }
    public static void main(String[] args) {
        Threads1 t1=new Threads1();
        Thread t=new Thread(t1);
        t.start();
        t.interrupt();

        Thread t2=new Thread(t1);
        t2.start();

        }
}
