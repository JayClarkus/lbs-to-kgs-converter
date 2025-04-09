package mypackage;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
    	boolean run = true;
    	Scanner scanner = new Scanner(System.in);
    	
    	while (run == true) {
        	
        	System.out.print("Enter the weight in lbs: ");
        	
        	if (scanner.hasNextDouble()) {
        		double lbs = scanner.nextDouble();
        		double kgs = lbs * 0.45359237;
            	System.out.printf("%.2f lbs = %.2f kgs",lbs, kgs);
            	
            	scanner.close();
            	run = false;
        	}
        	else {
        		System.out.println("Invalid Input, try again...");
        		System.out.println("------------------------------");
        		scanner.nextLine();
        	}
    	}
    	
    }

}
