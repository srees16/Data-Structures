//package TheadsWorkout;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Threadsrecollection {
	/* Inter-thread communication methods: JOIN, SLEEP, SYNCHRONIZED, WAIT & NOTIFY (NOTIFY ALL)
	 * JOIN: To join 2 threads to execute one after the other
	 * SLEEP: to keep 1 thread in Runnable state for a specified amount of time
	 * WAIT - NOTIFY: To keep a thread waiting until the previous thread notifies the completion of execution
	 * SYNCHRONIZED: To execute the threads one at a time and one after another
	 * Volatile: Prevents a thread from caching the value of a variable between multiple threads when the variable is not change from within a single thread
	 * ==============
	 * Threads can be created using sub-classing from Thread class and instantiating new object
	 * Threads can be created by implementing Runnable interface
	 * In both cases we need to implement RUN method
	 */
	private static int counter;
	
	private static synchronized void tapcounter () {
		counter++;
	}
	public static void main(String[] args) {
		
		ExecutorService es = Executors.newSingleThreadExecutor();
		es.execute(new Runnable (){
			public void run() {
				for (int i=0; i<2000;i++) {
					tapcounter();
				}
			}
		});
		System.out.println("ES ended");
		es.shutdown();
		
		//Synchronization 		
		//calling the thread runnable
		//Thread tt = new Thread (new threadcrap());
		//tt.start();
		
		//Creating a thread within main class
		Thread tit = new Thread (new Runnable(){

			public void run() {
				for (int i=0; i<20000;i++) {
					tapcounter();
				}
			}
		});
		Thread tits = new Thread (new Runnable(){

			public void run() {
				for (int i=0; i<20000;i++) {
					tapcounter();
				}
			}
		});
		tit.start();
		tits.start();
		try {
			tit.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			tits.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Count is "+ counter);
		//calling the thread from Thread extends
			/*
			threadshit ts = new threadshit ();
			threadshit ts1 = new threadshit ();
			ts.start();
			ts1.start();
			ts1.setPriority(10);
			*/
		Calc cc = new Calc ();
		cc.start();
		
		synchronized (cc) {
			try {
				cc.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} System.out.println(cc.sum);
	}
}
/*
class threadshit extends Thread {
	public void run () {
		for (int i=0; i<2;i++) {
			System.out.println(Thread.currentThread().getId()+"threadshit called");
		}
	}
}
class threadcrap implements Runnable {

	public void run() {
		for (int i=0; i<2;i++) {
			System.out.println("threadcrap called");
		}
	}
} */
class Calc extends Thread {
	long sum;
	public void run () {
		synchronized (this) {
			for (int i=0;i<1000;i++) {
				sum+=i;
			} notify ();
		}
	}
}