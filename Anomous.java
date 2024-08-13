public class Anomous {
public static void m1(){
    for(int i=1;i<=3;i++){
        System.out.println(Thread.currentThread().getName());
    }
}
    public static void main(String[] args) {
        Thread t=new Thread(){
            public void run(){
                m1();
            }
        };
        t.start();
    }
}
