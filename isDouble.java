import java.util.Scanner;

public class check {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers :");
		if(!sc.hasNextDouble()) {
			System.out.println("The number is not a double value !!");
			return;
		}
			double num1=sc.nextDouble();
			
		if(!sc.hasNextDouble()) {
			System.out.println("The number is not a double value !!");
			return;
		}
			double num2=sc.nextDouble();
		
		
		double avg=(num1+num2)/2;
		System.out.println("The average is : "+ avg);
	}

}
