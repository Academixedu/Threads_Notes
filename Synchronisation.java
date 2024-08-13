public class Synchronisation {
    public  synchronized void m1(){
        for(int i=1;i<=5;i++){
            System.out.println("Static"+Thread.currentThread().getName());
        }
    }
    public static synchronized void m2(){
        for(int i=1;i<=5;i++){
            System.out.println("Static"+Thread.currentThread().getName());
        }
    }
    public static void main(String[] args) {
    Synchronisation s =new Synchronisation();
    Thread t=new Thread(){
        public void run(){
           s.m1();
        }
    }; 
    t.start();
    Synchronisation s1 =new Synchronisation();
    Thread t1=new Thread(){
        public void run(){
           s1.m1();
        }
    }; 
    t1.start(); 
    }
}
