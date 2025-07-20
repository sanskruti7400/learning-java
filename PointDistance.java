public class TestPoint {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter x and y coordinates for point1:");
		double x1=sc.nextDouble();
		double y1=sc.nextDouble();
		Point2D p1=new Point2D(x1,y1);
		
		System.out.println("Enter x and y coordinates for point2:");
		double x2=sc.nextDouble();
		double y2=sc.nextDouble();
		Point2D p2=new Point2D(x2,y2);
		
		 System.out.println("\nPoint 1: " + p1.getDetails());
	     System.out.println("Point 2: " + p2.getDetails());
	     System.out.println("--------------------------------");
	     if (p1.isEqual(p2)) {
	            System.out.println("\nBoth points are the same.");
	        } else {
	            System.out.println("\nPoints are different.");
	            double distance = p1.calculateDistance(p2);
	            System.out.printf("Distance between points: %.2f\n", distance);
	        }
	}

}
public class Point2D {
	private double x;
	private double y;
	Point2D()
	{
		
	}
	public Point2D(double x, double y) {
	
		super();
		this.x = x;
		this.y = y;
	}
	public String getDetails() {
		
		return "Point coordinates:("+x+","+y+")";
				
	}
	public boolean isEqual(Point2D p2)
	{
		return this.x==p2.x && this.y==p2.y;
	}
	public double calculateDistance(Point2D other) {
        double d1 = this.x - other.x;
        double d2 = this.y - other.y;
        return Math.sqrt(Math.pow(d1, 2) + Math.pow(d2, 2));
    }

}

