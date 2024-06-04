package multithreading;

public class JoinDemo implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<=3;i++) {
			System.out.println(i+Thread.currentThread().getName());
		}
		System.out.println();
		
	}
	public static void main(String[] args) throws InterruptedException {
		Thread t1=new Thread(new JoinDemo(),"t1");
		Thread t2=new Thread(new JoinDemo(),"t2");
		Thread t3=new Thread(new JoinDemo(),"t3");
		Thread t4=new Thread(new JoinDemo(),"t4");
		t1.start();
		t1.join();
		t4.start();
		t2.start();
		t3.start();
		
		
	}

}
