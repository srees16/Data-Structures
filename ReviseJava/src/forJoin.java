
public class forJoin {
	public static int count = 0;
	public static synchronized void sync () {
		count++; //count=count+1
	}
	public static void main(String[] args) {
		Thread t1 = new Thread (new Runnable(){

			public void run() {
				for (double d = 0; d < 1000; d++) {
					sync (); 
				} try {
					Thread.sleep(3);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}	
			}
			
		});
		Thread t2 = new Thread (new Runnable(){

			public void run() {
				for (double d = 0; d < 1000; d++) {
					sync ();
				} try {
					Thread.sleep(3);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}	
			}
			
		});
		t1.start();
		t2.start();
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} //JOIN can be used to pause the current thread execution until unless the specified thread is dead
		System.out.println("The value " + count);
	}
	
}