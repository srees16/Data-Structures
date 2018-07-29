
public class Threadagainrunnable implements Runnable {

	public void run() {
		for (double d = 1; d <5; d++) {
			System.out.println(Thread.currentThread().getId()+ " Value " + d);
		} try {
			Thread.sleep(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}