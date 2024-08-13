public class DeamonThreads implements Runnable {
    public void run(){
       for(int i=0;i<7;i++){
        System.out.println("Threads :"+Thread.currentThread().getName()+" count  "+i);
       } 
    }
    public static void main(String[]args){
        DeamonThreads t=new DeamonThreads();
        Thread t1=new Thread(t);
        t1.setDaemon(true);
        t1.setName("Deamon");
        t1.start();
        Thread t2=new Thread(t);
        t2.setPriority(8);
        t2.start();
     
    }
}
