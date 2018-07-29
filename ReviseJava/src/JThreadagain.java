
public class JThreadagain extends Thread {

	public void run() {
		for (long l = 0; l < 6; l++) {
			System.out.println(Thread.currentThread().getId() + "Series " + l);
		} try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
	}
}
