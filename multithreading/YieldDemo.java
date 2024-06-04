package multithreading;

public class YieldDemo implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<=4;i++) {
			if(i==2) 
				Thread.yield();
			else {
				System.out.println(i+" "+Thread.currentThread().getName());
			}
				
		}
		
		
	}
	public static void main(String[] args) {
		Thread t1=new Thread(new YieldDemo());
		Thread t2=new Thread(new YieldDemo());
		t1.start();
		t2.start();
	}

	
}
