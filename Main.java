package mypackage;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
    	Scanner scanner = new Scanner(System.in);
    	
    	System.out.print("Enter the weight in lbs: ");
    	int lbs = scanner.nextInt();
    	
    	double kgs = lbs * 0.45359237;
    	System.out.printf("%d lbs = %.2f kgs",lbs, kgs);
    	
    	scanner.close();
    }

}
