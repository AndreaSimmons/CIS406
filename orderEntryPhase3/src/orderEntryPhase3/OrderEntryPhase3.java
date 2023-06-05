// Andrea Simmons, CIS406, Order Entry Phase 3 Lab, week 7

package orderEntryPhase3;
import java.util.*;
import java.text.NumberFormat;

public class OrderEntryPhase3
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
       	System.out.println("Order Entry System");
        System.out.println(); 
		Scanner sc = new Scanner(System.in);

		// Set variables.
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		int totalItems = 0;
		float totalGrossAmt = 0;
		float totalTax = 0;
		float totalDisc = 0;
		float totalNetAmt = 0;

        while (true)
        {
	        System.out.print("Enter the 10-digit item number or enter 'N' to finsh and get final totals: ");
	        String itemNumber = sc.next();						// alphanumeric
		    if(itemNumber.equalsIgnoreCase("n"))
		    {
		    	break;
		    } 

		    System.out.print("Enter one-word item description: ");
	        String itemDescription = sc.next();					// alphanumeric
	        
	        System.out.print("Enter price: ");
	        float itemPrice = sc.nextFloat();					// decimal
			String priceString = formatter.format(itemPrice);	// format as currency
	        
			System.out.print("Enter quantity ordered: ");
	        int itemQtyOrdered = sc.nextInt();					// integer
	        
	        float itemGrossAmt = itemPrice * itemQtyOrdered;
			String grossString = formatter.format(itemGrossAmt);// format as currency

	        System.out.print("Enter tax percentage: ");
	        float itemTaxPercent = sc.nextFloat();				// decimal
	        
	        float itemTaxAmt = itemGrossAmt * itemTaxPercent;
	        String taxString = formatter.format(itemTaxAmt);	// format as currency
	        
	        System.out.print("Enter discount percentage: ");
	        float itemDiscPercent = sc.nextFloat();				// decimal
	        
	        float itemDiscAmt = itemGrossAmt * itemDiscPercent;
	        String discString = formatter.format(itemDiscAmt);	// format as currency
	        	        
	        float itemNetAmt = itemGrossAmt - itemTaxAmt - itemDiscAmt;
			String netString = formatter.format(itemNetAmt);	// format as currency

	        // Display the results.
	        System.out.println();
	        System.out.println("Order Details");
	        System.out.println("Item" + "\t" + "\t" + "Desc" + "\t" + "Price" + "\t" + "Qty" + "\t" + "Gross" + "\t" + "Tax" + "\t" + "Disc" + "\t" + "Net Amount");
	        System.out.println(itemNumber + "\t" + itemDescription + "\t" + priceString + "\t" + itemQtyOrdered + "\t" + grossString + "\t" + taxString + "\t" + discString + "\t" + netString);
	        System.out.println();
	        
	        // Calculate the totals.
	        totalItems += 1;
	        totalGrossAmt += itemGrossAmt;
	        totalTax += itemTaxAmt;
	        totalDisc += itemDiscAmt;
	        totalNetAmt += itemNetAmt;
	        
        }

        // Display all the totals.
        System.out.println();
        System.out.println("Order Totals");
        System.out.println("Total Items Purchased: " + totalItems);
        System.out.println("Total Gross Amt: " + formatter.format(totalGrossAmt));
        System.out.println("Total Tax Amt: " + formatter.format(totalTax));
        System.out.println("Total Discount Amt: " + formatter.format(totalDisc));
        System.out.println("Total Net Amt: " + formatter.format(totalNetAmt));
        
        sc.close();       
	}
}
