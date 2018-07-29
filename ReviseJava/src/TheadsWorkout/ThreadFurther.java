//package TheadsWorkout;

import java.io.File;
import java.util.Scanner;

public class ThreadFurther {

	public static void main(String[] args) {
		runner r = new runner ();
		r.start();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Press Enter to stop");
		Scanner s = new Scanner (System.in);
		s.nextLine();
		r.shutdown();
		
		marathonrunner marath = new marathonrunner();
		marath.start();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Press a key to interrupt");
		Scanner sc = new Scanner (System.in);
		sc.nextLine();
		marath.shuts();
	}
}

class runner extends Thread {
	
	private volatile boolean running = true;
/*
Volatile keyword is used to prevent a thread from caching the value of the variable.Normally threads prevent access to
other threads,their variables while they are running.Volatile is used to change the value of the variable by other thread
*/

	public void run () {
		while (running) {
			System.out.println("Running..");
		}
	}
	public void shutdown () {
		running = false;
	}
}

class marathonrunner extends Thread {

	private volatile boolean marathon = true;
	
	public void run() {
		while (marathon) {
			System.out.println("Marathon runners reaching finals");
		}
	}
	public void shuts () {
		marathon=false;
	}
}