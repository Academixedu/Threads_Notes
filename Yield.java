
public class Yield extends Thread {
public void op() {
	for(int i=0;i<10;i++) {
		System.out.println(i+":"+Thread.currentThread().getName());
	}
}
	public static void main(String[] args) {
	Yield y=new Yield();
	Thread t=new Thread() {
		public void run() {
			y.op();
		}
	};
	// A 6 Y 6 
	// Y 10 Thread 1 May Have 90% to complete
	t.setPriority(5);
	t.start();
	
	Thread t1=new Thread() {
		public void run() {
			y.op();
		}
	};t1.start();
	t1.setPriority(5);
	t1.setName("Yield");
	Thread.yield();
	
	Thread t2=new Thread() {
		public void run() {
			y.op();
		}
	};
	t2.setPriority(2);
	t2.start();
	}
}
