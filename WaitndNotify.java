public class WaitndNotify {
    public static void main(String[] args) {
        DepositndWitdrawl d=new DepositndWitdrawl();
       
        Thread t=new Thread(){
            public void run(){  
        d.deposit(230000);
        }
        };
        t.setPriority(1);
        t.start();
        Thread t1=new Thread(){
            public void run(){  
        d.withdrawl(5600);
        }
        };
        t1.setPriority(10);
        t1.start();
    
    }
}
