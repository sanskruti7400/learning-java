import java.util.Scanner;

public class two {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String :");
		String s=sc.next();
		StringBuilder rev=new StringBuilder(s).reverse();
		System.out.println(rev);
//		String rev2 = new StringBuilder(s).reverse().toString();
//		System.out.println(rev2);
	}
}
