public class Jthreadex extends Thread {

	public void run() {
	for (int i = 0; i < 1; i++) {
		System.out.println(Thread.currentThread().getId() + "here" + i);
	}
	try {
		Thread.sleep(10);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}

	}
		
}