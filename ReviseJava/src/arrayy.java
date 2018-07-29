import java.util.Scanner;

public class arrayy {
	static int[] inputted () { // this method has to return int[]
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Please enter 10 numbers ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        return numbers; // return array here
    }
	
    static void outputted (int[] numbers) {
        for(int i = 0; i < numbers.length; i++) { 
            System.out.println(numbers[i]); 
        }
    }

     public static void main(String[] args) {
        int[] numbers = inputted (); // get the returned array
        outputted (numbers); // and pass it to output
    
    }
}