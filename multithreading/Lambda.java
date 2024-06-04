package multithreading;

public class Lambda {
	public static void main(String[] args) {
		Runnable r=()->{
			int sum=0;
			for(int i=0;i<11;i++) {
				sum+=i;
			}
			System.out.println(sum);
		};
		new Thread(r).start();
	}

}
