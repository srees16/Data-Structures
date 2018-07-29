//package TheadsWorkout;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Threadwork {

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
	public static void main(String[] args) {
		
			ExecutorService es = Executors.newSingleThreadExecutor();
			es.execute(new Runnable(){

				public void run() {
					System.out.println("Executor here!!");					
				}
			});
			es.shutdown();
			
			ExecutorService esi = Executors.newFixedThreadPool(10);
			ExecutorService esa = Executors.newScheduledThreadPool(10);
			
			
			chrome c = new chrome ();
			chrome cr = new chrome ();
			c.start();
			cr.start();
			
			Thread r = new Thread (new inetcpl());
			Thread rr = new Thread (new inetcpl());
			r.start();
			rr.start();
			
			Thread rt = new Thread (new Runnable(){

				public void run() {
					for (int i=0;i<4;i++) {
						System.out.println(Thread.currentThread().getId()+"  Love apples!!");
				}
			}
		});
		rt.start();
	}
}

class chrome extends Thread {
	public void run (){
		for (int i=0;i<4;i++) {
			System.out.println(Thread.currentThread().getId()+"  Love apple");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}	
	}
}
class inetcpl implements Runnable {

	public void run() {
		for (int i=0;i<4;i++) {
			System.out.println(Thread.currentThread().getId()+"  Runnable shit");
		} try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}