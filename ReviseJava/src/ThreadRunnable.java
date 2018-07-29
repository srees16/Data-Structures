
public class ThreadRunnable implements Runnable {

	public void run() {
		for (int r = 0; r < 4; r++) {
			System.out.println(Thread.currentThread().getId()+ "  SeriesID  "+ r);
			try {
				Thread.sleep(8);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}		
	}
}
