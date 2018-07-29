//package RevisionPractice;

public class threadsex {

	public static void main(String[] args) {
		classoutthread ct = new classoutthread ();
		classoutthread cts = new classoutthread ();
		
		ct.start();
		cts.start();
		cts.getPriority();
		Thread t = new Thread (new runthread());
		t.start();
		
		Thread tt = new Thread (new Runnable(){

			public void run() {
				String s [] = {"ass","hole","bast"};
				for (String x:s) {
					System.out.println(Thread.currentThread().getId()+" "+x);
				}
			}
		});
		tt.start();
	}
}
class classoutthread extends Thread {
	public void run () {
		String s [] = {"ab","cd","ef"};
		for (String x:s) {
			System.out.println(Thread.currentThread().getId()+" "+x);
		}
	}
}
class runthread implements Runnable {

	public void run() {
		String s [] = {"xy","yz","zx"};
		for (String x:s) {
			System.out.println(Thread.currentThread().getId()+" "+x);
		}
	}
}