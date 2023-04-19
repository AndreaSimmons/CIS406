// Andrea Simmons, CIS406, Order Entry Phase 1 Lab

package orderEntryPhase1;
import java.util.*;

public class OrderEntryPhase1
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println("Order Entry, Phase 1");
		System.out.println();
		
		// Create the Scanner object.
		Scanner sc = new Scanner(System.in);
		
		// Enter item number (alphanumeric).
		System.out.print("Enter item number (8-digit alphanumeric): ");
		String itemNum = sc.next();
		
		// Enter item description (alphanumeric).
		System.out.print("Enter item description: ");
		String itemDesc = sc.next();
		
		// Enter the item price (decimal).
		System.out.print("Enter item price (decimal): ");
		float itemPrice = sc.nextFloat();
		
		// Enter quantity ordered (integer).
		System.out.print("Enter item quantity ordered: ");
		int itemQ = sc.nextInt();
		
		// Enter the total tax for the item (decimal).
		// Calculate the total tax for the item(s).
		// Use Virginia Sales tax rate 5.3%
		float tax = 0.053f;
		float totalTax = tax * itemPrice * itemQ;
		
		// Enter the total discount for the item (decimal).
		// Calculate the total discount for the item(s).	
		// Use the standard 10% military discount
		float discount = 0.10f;
		float totalDisc = (itemPrice * itemQ) * totalTax * discount;
				
		// Enter the net amount for the item (decimal).
		// Calculate the net amount for the item(s).
		// The net amount is equal to the item price times the number of items,
		//  plus the total tax, minus the total discount
		float netAmount = (itemPrice * itemQ) + totalTax - totalDisc;
		
		
		// Display the item number, item description, item price, 
		// quantity ordered, tax amount, discount amount, and net amount.
		// Labels should be on one line and data on the second line.
		// Use tabs to line up the columns.
		System.out.println("Item Number    Item Description    Item Price    Quantity Ordered    Tax Amount    Discount Amount    Net Amount");
		System.out.print("# " + itemNum);
		System.out.print("     ");
		System.out.print(itemDesc);
		System.out.print("            ");
		System.out.printf("$%.2f", itemPrice);
		System.out.print("        ");
		System.out.print(itemQ);
		System.out.print("                    ");
		System.out.printf("$%.2f", totalTax);
		System.out.print("        ");
		System.out.printf("$%.2f", totalDisc);
		System.out.print("               ");
		System.out.printf("$%.2f", netAmount);
		
		sc.close();
	}

}