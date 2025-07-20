import java.util.Comparator;
import java.util.Scanner;

public class Student implements Comparable<Student>{
	String name;
	int rollno;
	int marks;
	
	public Student() {
		
	}
	
	public Student(String name,int rollno,int marks) {
		this.name=name;
		this.rollno=rollno;
		this.marks=marks;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public void accept(Scanner sc) {
		System.out.println("Enter the name :");
		name=sc.next();
		System.out.println("Enter the roll number :");
		rollno=sc.nextInt();
		System.out.println("Enter the marks :");
		marks=sc.nextInt();
	}
	@Override
	public String toString() {
		return "[Student : Name -"+name+" roll no - "+rollno+" marks - "+ marks+"]";
	}
	@Override
	public int compareTo(Student s) {
		return this.rollno-s.rollno;
	}
}
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Student> list=new ArrayList<Student>();
		while(true) {
			System.out.println("-----------------------------MENU-----------------------------");
			System.out.println("1. add the student in the collection");
			System.out.println("2. Display all the students using iterator.");
			System.out.println("3. search the student on rollno and if found display his details.");
			System.out.println("4. sort the students on rollno");
			System.out.println("5. sort the students on name");
			System.out.println("6. sort the students on marks");
			System.out.println("7.EXIT");
			
			System.out.println("Enter the choice -");
			int ch=sc.nextInt();
			
			switch(ch) {
			case 1:
				Student student=new Student();
				student.accept(sc);
				list.add(student);
				System.out.println("Student added!");
				break;
			case 2: 
				for(Student s:list) {
					System.out.println(s);
				}
				break;
			case 3:
				System.out.println("Enter the roll number you wnat search:");
				int n=sc.nextInt();
				int d=0;
				for(Student s:list) {
					if(s.getRollno()==n) {
						System.out.println(s);
						d=1;
					}
				}
				if(d==0) {
					System.out.println("the student not found!!");
				}
				break;
			case 4:
				Collections.sort(list);
				for(Student s:list) {
					System.out.println(s);
				}
				break;
			case 5:
				class c1 implements Comparator<Student>{
					@Override
					public int compare(Student o1,Student o2) {
						return o1.name.compareTo(o2.name);
					}
				}
				Collections.sort(list);
				for(Student s:list) {
					System.out.println(s);
				}
				break;
			case 6:
				class c2 implements Comparator<Student>{
					@Override
					public int compare(Student o1,Student o2) {
						return Integer.compare(o1.marks,o1.marks);
					}
				}
				Collections.sort(list);
				for(Student s:list) {
					System.out.println(s);
				}
				break;
			case 7:
				return;
			default:
				System.out.println("Invalid choice!!!!");
			}
		}
	}

}
