//package TheadsWorkout;

import java.util.ArrayList;

public class Shuttlelaunch {
	
	static int counter;

	public static synchronized void tosync () {
		counter++;
	}
	public static void main(String[] args) {
		//Creating thread from within main class
		Thread countdown = new Thread (new Runnable(){

			public void run() {
				System.out.println("Countdown ");
				for (int i=12;i>=-2;i--) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					} System.out.println(i);
				}
			}
		});
		countdown.start();
		booster b = new booster ();
		b.start();
		Thread lo = new Thread (new liftoff());
		lo.start();
	}
}
class booster extends Thread {

	public void run() {
		for (int j=1;j<10;j++) {
			if (j%5==0) {
				System.out.println("Booster Ignite");
			} try {
				Thread.sleep(getId());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}	
}
class liftoff implements Runnable {

	public void run() {
		ArrayList al = new ArrayList ();
	}
}

/*
 * for (int k=1;k<10;k++) {
			if (k%10==0) {
				System.out.println("Lift Off!");
			}
		}
 * /
 */