import java.util.Scanner;

public class Arearc {
	
		Arearc(double length,double breadth){
		
		String area=String.format("%.3f", (length*breadth));
		System.out.println("Area of Rectange Is "+area+"sq.units");
	}
	
	Arearc(double radius){
		
		double pi = 3.141;
		String area= String.format("%.3f", (pi*Math.pow(radius, 2)));
		System.out.println("Area of Circle is "+area+"sq.units");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double radius,length,breadth;
		
		System.out.println("Enter radius of circle :");
		radius =sc.nextDouble();
		Arearc circle = new Arearc(radius);
		
		System.out.println("Enter  length and beadth of rectangle :");
		length = sc.nextDouble();
		breadth=sc.nextDouble();
		Arearc rectangle = new Arearc(length,breadth);
		


		
		
		
		
		
	}
	

}