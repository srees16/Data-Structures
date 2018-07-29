//package RevisionPractice;

public class Methodtypes {

	public static void main(String[] args) {
		
	}
	/*
	Types of Methods:
	Void without parameters
	Void with parameters
	Non-static void without parameters********
	Non-void with parameters (returning,with variable type in method name) 
	Non-void without parameters (returning,with variable type in method name)
	Constructor with parameters
	Constructor without parameters
	#Tip: When you instantiate (create an object) with the same name as the constructor method, that object itself calls
	the action that is present in the constructor.
	Also, constructor runs first than any other method (be it void, non-void returning, or void/non-void with/without 
	parameters
	Static block can be created to initiate the value of a static variable when you dont want to initialize the variable
	in the class itself.
	Static blocks are called first when its class is instantiated in Main class. It takes priority over constructors and 
	other void/non-void methods with/without parameters.
	 * A void non-static method in a child class can be called in to main class via the object and its method name
	 * You cannot instantiate or create an object out of a class which is declared as abstract
	 * A method can be made abstract only if its class is declared abstract
	 * A constructor in a child class can be called in to main class by just instantiating the object
	 * Static method can access only non static member variables
	*/
	
	//Non-void (returning,with variable type in method name) with parameters
	public static String anex (String s) {
		return s;
	}
	//Non-void (returning,with variable type in method name) without parameters
	public static String anex () {
		return null;
	}
	//Void without parameters
	public static void methodex () {
		
	}
	//Non-void (returning,with variable type in method name) with parameters
	public static int methodex3 (int x) {
		return x;
	}
	//Non-void (returning,with variable type in method name) without parameters
	public static String methodex1 (String s) {
		return s;
	}
	//Void with parameters
	public static void methodex2 (String p, int x) {
		
	}
	//Constructor with single parameters
	Methodtypes (int x) {
		
	}
	//Constructor with multiple parameters
	Methodtypes (int x, String s) {
		
	}
	//Constructor without parameters
	Methodtypes () {
		
	}
}
