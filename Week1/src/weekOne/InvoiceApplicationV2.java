
package weekOne;

import java.util.Scanner;

public class InvoiceApplicationV2 {

	public static void main(String[] args) {

		//variables
		int invoiceCount=0;
		double invoiceTotal= 0.0; double discountTotal=0.0;
	

		// scanner object:
		Scanner sc = new Scanner(System.in);

		//perform invoice calculation / input from the user to continue y/n?
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {

			//invoice subtotal form user
			System.out.println(" Enter subtotal : ");
			double subtotal = sc. nextDouble();

			double discountPercent = 0.0;
			if (subtotal>=500) {
				discountPercent =0.25;
			}else if (subtotal >= 200) {
				discountPercent = 0.2;
			}else if (subtotal >= 100) {
				discountPercent = 0.1;

			}

			double discountamount = subtotal * discountPercent;
			double total= subtotal- discountamount;

			// calculations for average

			invoiceCount= invoiceCount +1;
			discountTotal = discountTotal + discountamount;
			invoiceTotal= invoiceTotal + total; 

			//print the meassage:

			//			System.out.println("Discount percent : " + discountPercent);
			//			System.out.println("Discount amount : " + discountamount);
			//			System.out.println("Discount total : " + discountTotal);
			String message = "Discount percent : " + discountPercent + "\n" + " Discount amount: " + 
					discountamount + "\n"+ "Discount total : " + total + "\n";
			System.out.println(message);

			// if user want to continue y/n?
			System.out.println("Continue? (y/n): ");
			choice = sc.next();

			// print the message for average:

			System.out.println("Number of invoices: " + invoiceCount);
			System.out.println("Average invoice: " + invoiceTotal/invoiceCount);
			System.out.println("Average discount: " + discountTotal/invoiceCount);
		}
	}
}



















	//		// perform invoice calculations until choice isn't equal to "y" or "Y"
	//	
	//      int invoiceCount = 0;
	//		double invoiceTotal = 0.0, discountTotal = 0.0;

	//		String choice = "y";
	//		while (choice.equalsIgnoreCase("y")) {
	//
	//			// get the invoice subtotal from the user
	//			System.out.print("Enter subtotal:   ");
	//			double subtotal = sc.nextDouble();
	//
	//			// calculate the discount amount and total
	//			double discountPercent = 0.0;
	//			if (subtotal >= 500) {
	//				discountPercent = .25;
	//			} else if (subtotal >= 200) {
	//				discountPercent = .2;
	//			} else if (subtotal >= 100) {
	//				discountPercent = .1;
	//			}else {
	//				System.out.println("discount not applied");
	//			}
	//			double discountAmount = subtotal * discountPercent;
	//			double total = subtotal - discountAmount;
	//
	//			// for the average...
	//			
	//			
	//			invoiceCount = invoiceCount + 1;
	//			discountTotal = discountTotal + discountAmount;
	//			invoiceTotal = invoiceTotal + total;
	//
	//			// display the discount amount and total
	//			//String message = "Discount percent: " + discountPercent + "\n" + "Discount amount:  " + discountAmount
	//					//+ "\n" + "Invoice total:    " + total + "\n";
	//			System.out.println("Discount percent:" +discountPercent);
	//			System.out.println("Discount amount:" +discountAmount);
	//			System.out.println("Total:" + total);
	//			
	//			//System.out.println(message);
	//
	//			// see if the user wants to continue
	//			System.out.print("Continue? (y/n): ");
	//			choice = sc.next();
	//			System.out.println();
	//		}
	//		String message = "Number of invoices: " + invoiceCount + "\n" + "Average invoice: "
	//				+ invoiceTotal / invoiceCount + "\n" + "Average discount: " + discountTotal / invoiceCount + "\n";
	//		System.out.println(message);
//}
//}
