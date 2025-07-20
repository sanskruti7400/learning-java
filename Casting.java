package day6;

import java.util.Scanner;

public class Casting {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Employee");
		System.out.println("2.Manager");
		System.out.println("3.Salesman");
		Employee e=null;
		System.out.println("Enter your choice :");
		int ch=sc.nextInt();
		
		switch(ch) {
			case 1:
				e=new Employee();//Upcasting
				break;
			case 2:
				e=new Manager();
				break;
			case 3:
				e=new Salesman();
				break;
			default:
				System.out.println("Invalid choice!");
		}
		e.accept(sc);
		System.out.println(e.toString()); 
		if(e instanceof Salesman) {
			Salesman em=(Salesman)e;  //Downcasting
			System.out.println("Commission "+em.calculateTotalCommission());
			
		}
	}
}
class Employee{
	int empId;
	double sal;
	
	public Employee() {
		
	}
	
	public Employee(int empId, double sal) {
		this.empId = empId;
		this.sal = sal;
	}
	
	
	public void accept(Scanner sc) {
		System.out.print("Enter the empid - ");
		empId = sc.nextInt();
		System.out.print("Enter the salary - ");
		sal = sc.nextDouble();
	}
	
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", sal=" + sal + "]";
	}
	
}
class Manager extends Employee{
	double bonus;

	public Manager() {
		
	}
	
	
	public Manager(int empid,double sal,double bonus) {
		super(empid,sal);
		this.bonus = bonus;
	}


	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.print("Enter bonus - ");
		bonus = sc.nextDouble();
	}
	
	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "Manager [bonus=" + bonus + "]";
	}
	
	
}
class Salesman extends Employee{
	double comminsion;
	int n;
	
	public Salesman() {
		
	}
	
	public Salesman(int empid,double sal,double comminsion, int n) {
		super(empid,sal);
		this.comminsion = comminsion;
		this.n = n;
	} 
	
	
	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.print("Enter the no of products sold - ");
		n = sc.nextInt();
		System.out.print("Enter the commision per product - ");
		comminsion = sc.nextDouble();

	}
	
	double total;
	public double calculateTotalCommission() {
		total=n*((sal*comminsion/100)+sal);
		return total;
	}
	public double getComminsion() {
		return comminsion;
	}
	public void setComminsion(double comminsion) {
		this.comminsion = comminsion;
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	
	@Override
	public String toString() {
		return "Salesman [comminsion=" + comminsion + ", n=" + n + "]";
	}
	
}
