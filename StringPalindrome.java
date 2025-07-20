import java.util.Scanner;

public class third {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String :");
		String s=sc.next();
		String rev=new StringBuilder(s).reverse().toString();
		if(s.equals(rev)) {
			System.out.println("The String is Palindrome!!!!");
		}else {
			System.out.println("The String is not Palindrome!!!!");
		}
	}
}
