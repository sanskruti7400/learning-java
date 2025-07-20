import java.util.Scanner;

public class Accept {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the integer number :");
		int num=sc.nextInt();
		System.out.println("The Entered Integer Number is : "+ num);
		System.out.println("The binary num : "+Integer. toBinaryString(num));
		System.out.println("The Octal num : "+Integer. toOctalString(num));
		System.out.println("The Hexadecimal num : "+Integer. toHexString(num));
	}

}
