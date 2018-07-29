

public class PolymorphicPlayground {

	public static void main(String[] args) {
		
		/*vegeatables veggies = new vegeatables ();
		vegeatables lf = new ladiesfingers ();
		vegeatables bj = new brinjals ();
		veggies.curries();
		veggies.fruits ();
		lf.curries();
		bj.fruits();
		lf.nonveg();
		
		vegeatables veggies1 [] = new vegeatables [2];
		veggies1 [0] = new brinjals ();
		veggies1 [1] = new ladiesfingers ();
		
		for (int i = 0; i < veggies1.length; ++i) {
			veggies1[i].curries();
		}*/
			
		/*
		vegeatables myveggies [] = new vegeatables [2];
		myveggies[0] = new brinjals ();
		myveggies [1] = new ladiesfingers ();
		
		for (int x = 0 ; x < myveggies.length ; ++x) {
			myveggies[x].curries();
			myveggies[x].fruits();
			myveggies[x].nonveg();
			}
		*/
		//Abstract class or method means that you cant instantiate (or create objects) that specific method or class
		//An abstract class can have both abstract n non-abstract methods
		/*
		healthy hlth = new healthy ();
		//vegeatables vg = new vegeatables (); //error here bcoz i cant instantiate (create object out of) an abstract class)
		vegeatables lf = new ladiesfingers ();
		vegeatables bj = new brinjals ();
		
		//hlth.bloodcount(vg); //error bcoz of same reason as above
		hlth.bloodcount(lf);
		hlth.bloodcount(bj); */
		/*
		marslings obj = new marslings ();
		mars m = new mars ();
		obj.add(m); */
		
		listofmarinecreatures lmc = new listofmarinecreatures ();
		dolphins dlp = new dolphins ();
		sharks srk = new sharks ();
		whales wh = new whales ();
		
		lmc.add(wh);
		lmc.add(srk);
		lmc.add(dlp); 
		
		gods gd [] = new gods [3];
		rama rm = new rama ();
		krishna krs = new krishna ();
		jesus js = new jesus ();
		
		gd[0]=rm;
		gd[1]=krs;
		gd[2]=js;
		
		for (gods g : gd){
			g.god();
		}
	} 

}