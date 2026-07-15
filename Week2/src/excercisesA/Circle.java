package excercisesA;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		/* 1.	Write a program called Circle. Ask the user for the radius. 
		 * Given the radius, calculate the diameter, circumference and the area (Google the formulae). 
		 * Use constants where appropriate. Note that constants are declared with the keyword final preceding
		 *  the type and the identifier is all capitals (good practice) i.e. final double PI = 3.14;
		 */
		
// initialize variables with using final for constant PI 
	
//		        Scanner sc = new Scanner(System.in);
//
//		        final double PI = 3.14;
//
//		        double radius;
//		        double diameter;
//		        double circumference;
//		        double area;
//
//		        System.out.print("Enter radius: ");
//		        radius = sc.nextDouble();
//
//		        diameter = 2 * radius;
//		        circumference = 2 * PI * radius;
//		        
//		        area = PI * radius * radius;
//
//		        System.out.println("The diameter is " + diameter);
//		        System.out.println("The circumference is " + circumference);
//		        System.out.println("The area is " + area);
//
//		        sc.close();
//		    }
//		}

// Solution by Thiago

	
		double radius=0, diameter=0, circumference=0, area=0;
		final double PI=3.14; // a constant (could use Math.PI)
		
		// get the radius from the user
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter radius: ");
		radius = sc.nextDouble();
		
		//PI=3.14; // get an error
		
		// calculate the diameter
		diameter = radius * 2;
		System.out.println("The diameter is "+diameter);
		
		// calculate the circumference
		circumference = PI * diameter;
		System.out.println("The circumference is "+circumference);

		// calculate the area
//		area = PI * (radius * radius);
		area = PI * Math.pow(radius, 2);
		System.out.println("The area is "+area);
	}

}


				
				
	
