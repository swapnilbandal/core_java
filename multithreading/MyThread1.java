package multithreading;

public class MyThread1 implements Runnable {
	public void run() {
		for(int i=1;i<3;i++) {
			System.out.println("Thread Name: "+Thread.currentThread().getName()+" Id: "+Thread.currentThread().getId());
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		MyThread1 m1 = new MyThread1();
		MyThread1 m2 = new MyThread1();
		Thread t1=new Thread(m1);
		Thread t2=new Thread(m2);
		t1.setName("One");
		t2.setName("Two");
		t1.start();
		t2.start();
		m1.run();
		
		
	}
}
