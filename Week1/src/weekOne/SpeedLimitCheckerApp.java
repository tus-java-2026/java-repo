package weekOne;

import java.util.Scanner;
public class SpeedLimitCheckerApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String cont="y";
		
	
		while (cont.equalsIgnoreCase("y")) {

			System.out.print("Enter vehicle speed (km/h)...");
			int speed = sc.nextInt();

			if (speed <0 || speed > 250) {
				System.out.println("Error... speed outside the range...");
			}else if (speed > 120) {
				System.out.println("Over Speed Limit – Fined " + speed);			
			}else if (speed >=100) {
				System.out.println("Over Speed Limit – Warning " + speed);
			}else if (speed >=60) {
				System.out.println("Normal Speed " + speed);
			}else if (speed >=30) {
				System.out.println("Cautious Driving " + speed);
			}else {
				System.out.println("Too slow - Hazardous " + speed);
			}			


			System.out.print("Do you want to check another speed? (y/n)?");
			cont = sc.next();

		}

		System.out.println("Bye!");




	}

}


















//		System.out.print("Enter the speed of the vehicle in (km/h):" );
//
//		double speed = sc.nextDouble();
//
//		if (speed >0 && speed <= 250)
//		{
//			if (speed > 120) {
//				System.out.println("Over speed limit - Warning");
//			} else if (speed <= 100) {
//				System.out.println("Normal speed");
//			} else if (speed >= 60) {
//				System.out.println("Catious Driving");
//			} 		else if (speed > 30) {
//				System.out.println("Too Slow – Hazardous");
//			} 
//		}
//		else
//
//		{ 
//			if (speed >=250)
//			{			System.out.println("Invalid speed input");
//			}
//
//
//		}
//	}
//}
//






