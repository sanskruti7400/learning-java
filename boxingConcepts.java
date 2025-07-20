public class boxing {
	public static void main(String args[]) {
		int num1=10;
		
		Integer i=new Integer(num1);
		// boxing ====converting the primitive type to the reference type
		
		System.out.println(i);
		
		int num2=i.intValue();
		//unboxing====converting the reference type to the primitive type
		
		System.out.println(num2);
		
		Integer i1=num2;
		//autoboxing
		System.out.println(i1);
		
		int num3=i1;
		//autounboxing
		System.out.println(i);
	}
}
