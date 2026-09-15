import java.util.Scanner;

public class IT26101217Lab6Q2B {

  public static void main(String[] args) {
  
    Scanner scanner = new Scanner(System.in);
	
	int[] numbers = new int[10];
	int i = 0;
	
	System.out.println("Please enter 10 numbers:");
	
	while (i < 10) {
	    System.out.print("Enter number " + (i + 1) + ": ");
		numbers[i] = scanner.nextInt();
		i++;
	}
	
	System.out.println("\nThe numbers you entered are:");
	
	int j = 0;
	while (j < 10) {
	    System.out.print(numbers[j] + " ");
		j++;
	}
	
	scanner.close();
	
  }
  
}