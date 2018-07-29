package TheadsWorkout;

public class ThreadMain {
	
	public static void main(String[] args) {
		
		/* Inter-thread communication methods: JOIN, SLEEP, SYNCHRONIZED, WAIT & NOTIFY (NOTIFY ALL)
		 * JOIN: To join 2 threads to execute one after the other
		 * SLEEP: to keep 1 thread in Runnable state for a specified amount of time
		 * WAIT - NOTIFY: To keep a thread waiting until the previous thread notifies the completion of execution
		 * SYNCHRONIZED: To execute the threads one at a time and one after another
		 * ==============
		 * Threads can be created by sub-classing from Thread class and instantiating new object
		 * Threads can be created by implementing Runnable interface
		 * In both cases we need to implement RUN method
		 * Run the thread by calling start(),else run() will have same thread ID as other threads
		 */
		threadclass tc = new threadclass ();
		threadclass tc1 = new threadclass ();
		threadclass tc2 = new threadclass ();
		tc.start();
		tc1.start();
		try {
			tc.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		tc.run();
		tc1.run(); //these two methods are having the same thread ID. Thats why we need to use Start method
		
		
		//Calling Runnable thread
		Thread th = new Thread (new threadruns());
		Thread th1 = new Thread (new threadruns());
		th.start();
		th1.start();
		
		//Creating thread within main method as anonymous class
		Thread tits = new Thread (new Runnable(){

			public void run() {
				for (int j=0;j<10;j++) {
					System.out.println(Thread.currentThread().getId()+" Value "+j);
				try {
					Thread.sleep(200);
					} catch (InterruptedException e) {
					e.printStackTrace();
					}
				}
			}
		});
		tits.start();
	}
}
class threadclass extends Thread {

	public void run() {
		for (int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getId()+" Value "+i);
		}
	}
}
class threadruns implements Runnable{

	public void run() {
		for (int j=0;j<5;j++) {
			System.out.println(Thread.currentThread().getId()+" Value "+j);
		try {
			Thread.sleep(200);
			} catch (InterruptedException e) {
			e.printStackTrace();
			}
		}
	}
}