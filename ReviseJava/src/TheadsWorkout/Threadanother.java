//package JEEPackage;

public class Threadanother {

	public static void main(String[] args) {
		launchthread l = new launchthread ();
		launchthread l1 = new launchthread ();
		l.start();
		l1.start();
		
		try {
			l.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Thread tr = new Thread (new truns());
		tr.start();
		
		Thread tity = new Thread (new Runnable(){

			public void run() {
				for (int o =0;o<5;o++) {
					System.out.println("I'm Legend");
				}
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		tity.start();
	}
}

class launchthread extends Thread {
	 public void run () {
		for (int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getPriority()+" Hi at " +i);
		}
	}
}

class truns implements Runnable{

	public void run() {
		for (int j=0;j<5;j++) {
			System.out.println(Thread.currentThread().getId()+" Hello! "+j);
		try {
			Thread.sleep(100);
			} catch (InterruptedException e) {
			e.printStackTrace();
			}
		}
	}
}