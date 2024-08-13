
public class Joins {

	public void m1() {
	for(int i=0;i<10;i++) {
		System.out.println(i+":"+Thread.currentThread().getName());
	}}
	
	public void m2() {
		for(int i=0;i<10;i++) {
			System.out.println(i+":"+Thread.currentThread().getName());
		}
	}
	public static void main(String[] args) throws InterruptedException {
		Joins j=new Joins();
		Thread t=new Thread() {
			public void run() {
				j.m1();
			}
		};t.start();
			
		
		Thread t1=new Thread() {
			public void run() {
				j.m1();
			}
			
		};
		t1.start();
		t1.join();
		
		Thread t3=new Thread() {
			public void run() {
				j.m1();
			}
		};t3.start();
	}
}
