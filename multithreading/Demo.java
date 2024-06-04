package multithreading;

public class Demo {
	public static void main(String[] args) {
		ThreadGroup tg=new ThreadGroup("Parent");
		System.out.println(tg.getName());
		ThreadGroup cg=new ThreadGroup(tg,"Child");
		System.out.println(cg.getParent().getName()+" is a Parent thread of "+cg.getName());
		System.out.println("Group Thread: "+Thread.currentThread().getThreadGroup().getName());
		System.out.println("Parent Group Thread: "+Thread.currentThread().getThreadGroup().getParent().getName());
		System.out.println(tg.getMaxPriority());
		ThreadGroup system=Thread.currentThread().getThreadGroup().getParent();
		Thread[]t=new Thread[system.activeCount()];
		System.out.println("ActiveCount of Thread: "+system.activeCount());
		System.out.println("ActiveCount of Group: "+system.activeGroupCount());
		system.enumerate(t);
		for(Thread t1:t) {
			System.out.println("Thread name: "+t1.getName()+" Is Daemon: "+t1.isDaemon());
		}
		tg.setMaxPriority(7);
		Thread t1=new Thread(tg,"one");
		Thread t2=new Thread(tg,"two");
		Thread t3=new Thread(tg,"three");
		Thread t4=new Thread(tg,"four");
		t4.setPriority(8);
		System.out.println("T1: "+t1.getPriority());
		System.out.println("T1: "+t2.getPriority());
		System.out.println("T1: "+t4.getPriority());
		System.out.println("t4: "+tg.getMaxPriority());
		
	}
}
