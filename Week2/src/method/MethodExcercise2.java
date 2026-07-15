
/*2.In main(), get in the length, width and height of a cylinder from the user (3 int values). 
 * Pass these values to a method named calcVolume(), which calculate the volume of the cylinder (length*width*height). 
 * Output the volume calculated back in main(). The screen display is:
a.Method with 3 arguments
b.Same as a but with an overloaded method that takes no arguments.
Sample Output 
Enter length : 2 
Enter width : 3 
Enter height : 4 
The volume is 24 */


package method;

import java.util.Scanner;

public class MethodExcercise2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);


		System.out.print("Enter length: ");
		int length = sc.nextInt();

		System.out.print("Enter width: ");
		int width = sc.nextInt();

		System.out.print("Enter height: ");
		int height = sc.nextInt();

		int volume = calcVolume(length, width, height);

		System.out.println("The volume is " + volume);

		sc.close();
	}

	private static int calcVolume(int length, int width, int height) {

		int volume;

		volume = length * width * height;

		return volume;
	}
}