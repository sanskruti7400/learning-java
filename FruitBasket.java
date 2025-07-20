public class Orange extends Fruit {
	Orange(){
		
	}
	public Orange(String color,double weight,String name) {
		super(color,weight,name);
	}
	@Override 
	public String toString() {
		return "[name: "+name+" weight:"+weight+" color:"+color+"]";
	}
	public String taste() {
		return "Sour";
	}
}
public class Mango extends Fruit {

	Mango(){
		
	}
	public Mango(String color,double weight,String name) {
		super(color,weight,name);
	}
	@Override 
	public String toString() {
		return "[name: "+name+" weight:"+weight+" color:"+color+"]";
	}
	public String taste() {
		return "sweet";
	}
}

public class Apple extends Fruit {
	Apple(){
		
	}
	public Apple(String color,double weight,String name) {
		super(color,weight,name);
	}
	@Override 
	public String toString() {
		return "[name: "+name+" weight:"+weight+" color:"+color+"]";
	}
	public String taste() {
		return "sweet n sour";
	}
}

public class Fruit {
	String color;
	double weight; 
	String name;
	
	boolean isFresh=true;
	
	Fruit(){
		
	}
	public Fruit(String color,double weight, String name ) {
		this.color=color;
		this.weight=weight;
		this.name=name;
	}
	@Override
	public String toString() {
		return "[name: "+name+" weight:"+weight+" color:"+color+"]";
	}
	public String taste() {
		return "no specific taste";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public boolean getIsFresh() {
		return isFresh;
	}
	public void setIsFresh(boolean isFresh) {
		this.isFresh=isFresh;
	}
}

import java.util.Scanner;

public class FruitBasket {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the basket size");
		int n=sc.nextInt();
		Fruit[] basket=new Fruit[n];

		int i=0;
		while(true) {
			System.out.println("----------------Menu----------------");
			System.out.println("0.Exit");
			System.out.println("1. Add Mango");
			System.out.println("2. Add Orange");
			System.out.println("3. Add Apple");
			System.out.println("4.fruits in the basket");
			System.out.println("5. Display name,color,weight , taste of all fresh fruits , in the basket.");
			System.out.println("6. Mark a fruit as stale");
			System.out.println("7. Display tastes of all stale(not fresh) fruits in the basket.");
			
			
			System.out.println("Enter the choice :");
			int ch = sc.nextInt();
			
			
			switch(ch) {
				case 0:
					return;
				case 1:
					if(i<n) {
						basket[i]=new Apple("red",10,"Apple");
						i++;
					}
					break;
				case 2:
					if(i<n) {
						basket[i]=new Orange("orange",10,"Orange");
						i++;
					}
					break;
				case 3:
					if(i<n) {
						basket[i]=new Mango("Yellow",10,"Mango");
						i++;
					}
					break;
				case 4:
					for(Fruit j:basket) {
						if(basket==null) {
							System.out.println("Basket is Empty!!");
						}else {
							System.out.println(j.getName());
						}
					}
					break;
				case 5:
					for(Fruit j:basket) {
						if(basket==null) {
							System.out.println("Basket is Empty!!");
						}else {
							System.out.println("the properties :\n"+j.toString()+"\ntaste:\n"+j.taste()+"\nFresh:\n"+j.getIsFresh());
						}
					}
					break;	
				case 6:
					int stale=sc.nextInt();
					if(stale>=0 && stale<i && basket[stale]!=null) {
						basket[stale].setIsFresh(false);
					}else {
						System.out.println("Error in index!!!!");
					}
					break;
				case 7:
					for( Fruit k : basket) {
						if(k!=null && !k.getIsFresh()) {
							System.out.println("[Name : "+k.getName()+" Taste : "+k.taste()+"]");
						}else {
							System.out.println("No stale Fruits!!");
							break;
							
						}
					}
					break;
				default:
					System.out.println("Wrong choice!!!");
			}
		}
	}
}
