//package TheadsWorkout;

public class Threadsync {
	/* Inter-thread communication methods: JOIN, SLEEP, SYNCHRONIZED, WAIT & NOTIFY (NOTIFY ALL)
	 * JOIN: To join 2 threads to execute one after the other
	 * SLEEP: to keep 1 thread in Runnable state for a specified amount of time
	 * WAIT - NOTIFY: To keep a thread waiting until the previous thread notifies the completion of execution
	 * SYNCHRONIZED: To execute the threads one at a time and one after another
	 * ==============
	 * Threads can be created using sub-classing from Thread class and instantiating new object
	 * Threads can be created by implementing Runnable interface
	 * In both cases we need to implement RUN method
	 */
	private static int counter;
	
	public static synchronized void letssync() {
		counter++;
	}
	
	public static void main(String[] args) {
		
		Thread t = new Thread (new Runnable(){

			public void run() {
				for (int j=0;j<10000;j++) {
					letssync();
				}
			}
		});
		t.start();
		Thread tt = new Thread (new Runnable(){

			public void run() {
				for (int j=0;j<10000;j++) {
					letssync();
				}
			}
		});
		tt.start();
		try {
			tt.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Count is "+counter);
	}
}