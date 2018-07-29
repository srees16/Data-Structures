//package TheadsWorkout;

public class ThreadsPractical {
	
	private static int counter;
	/* Inter-thread communication methods: JOIN, SLEEP, SYNCHRONIZED, WAIT & NOTIFY (NOTIFY ALL)
	 * JOIN: To join 2 threads to execute one after the other
	 * SLEEP: to keep 1 thread in Runnable state for a specified amount of time
	 * WAIT - NOTIFY: To keep a thread waiting until the previous thread notifies the completion of execution
	 * SYNCHRONIZED: To execute the threads one at a time and one after another
	 * ==============
	 * Threads can be created
	 * 1. by sub-classing from Thread class and instantiating new object
	 * 2. by implementing Runnable interface and then passing the runnable method as parameter
	 * 3. by creating interface of Runnable directly in the main class
	 * In both cases we need to implement RUN method
	 */
	public static synchronized void counterkeeper () {
		counter++;
	}
	public static void main(String[] args) {
		Thread t = new Thread (new Runnable(){
			public void run() {
				for (int i = 0; i<10000;i++) {
					counterkeeper();
				}
			}
		});
		t.start();
		Thread t2 = new Thread (new Runnable(){
			public void run() {
				for (int i = 0; i<10000;i++) {
					counterkeeper();
				}
			}
		});
		t2.start();
		try {
			t2.join();//Using join here so that the previous thread is finished and stores its count,however,counter no would be printed before t2 is finished,hence JOIN used
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Counter is " + counter); //I can use join WITHOUT synchronized and get to work,but not synchronized block without JOIN()..
	}
}