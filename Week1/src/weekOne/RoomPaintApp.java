//The application should:
//		•	Ask the user to enter the height, width, and length of a room in meters.
//		•	Calculate the surface area of the four walls using the formula: 2 * height * (length + width).
//		•	Calculate how many liters of paint are needed (1 liter covers 10 square meters). Round up (Math.ceil()).
//		•	Calculate and display the total cost if each liter of paint costs €14.50.


package weekOne;

import java.util.Scanner;

public class RoomPaintApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter room height(m)");
		double height = sc.nextDouble();
		System.out.print("Enter room width(m)");
		double width = sc.nextDouble();
		System.out.print("Enter room length(m)");
		double length = sc.nextDouble();
		
		double surfaceArea = 2*height*(length +width);
		double paintRequired = Math.ceil(surfaceArea/10);
		double cost = paintRequired * 14.50;
		
		System.out.println("Wall surface area: " + surfaceArea);
		System.out.println("Paint required: " + paintRequired);
		System.out.println("Total cost: " + cost);

	}

}

		
//		System.out.println();
//		System.out.printf("Surface area of the four walls: %.2f square meters%n", surfaceArea);
//		System.out.printf("Paint required: %.0f liters%n", paintRequired);
//		System.out.printf("Total cost: €%.2f%n", cost);

		








