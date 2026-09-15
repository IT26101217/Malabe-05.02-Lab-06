import java.util.Scanner;

public class IT26101217Lab6Q3 {

  public static void main(String[] args) {
  
    Scanner scanner = new Scanner(System.in);
	
	double sumOfSquares = 0;
	int count = 0;
	
	System.out.println("Enter positive integers (terminate input with -99):");
	
	System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		
		while (number != -99) {
		
		    if (number < 0) {
				System.out.println("Invalid input. Please enter a positive integer or -99 to terminate");
		    } else {
		        sumOfSquares += (number * number);
			    count++;
			}
			
			System.out.print("Enter a number: ");
			number = scanner.nextInt();
		}
	
	if (count > 0) {
	    double rms = Math.sqrt(sumOfSquares / count);
		System.out.println("\nThe Root Mean Square (RMS) is: " + rms);
	} else {
	    System.out.println("\nNo valid numbers were entered.");
	}
	
	scanner.close();
	
  }
  
}