import java.util.Scanner;

public class MultiplicationTableGenerator {

	//Method to Generate Multiplication Table
	public static void tableGenerator(int number) {
		
		for(int i=1; i<=10; i++) {
			int result = number*i;
			System.out.println(number + "x" +i +  "=" +result);
		}
	}
	
	public static void main(String[] args) {
		
		//Let the user enter the number for its Multiplication Table
		System.out.println("Enter a number for its multiplication table to be printed to console");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.println("Multiplication Table of number " + number + " is\n");
		
		//Calling Multiplication Table Method
		tableGenerator(number);
		sc.close();
	}
}
