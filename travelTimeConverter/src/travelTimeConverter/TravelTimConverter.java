// Andrea Simmons, CIS406, Temperature Conversion Lab

package travelTimeConverter;
import java.util.*;

public class TravelTimConverter
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		// Intro
		System.out.println("Welcome to the Travel Time Converter");
		System.out.println();
		
		// Create the Scanner object.
		Scanner sc = new Scanner(System.in);

		// Enter miles.
		System.out.print("Enter miles:          ");
		Double miles = Double.parseDouble(sc.nextLine());
				
		// Enter miles per hour.
		System.out.print("Enter miles per hour: ");
		Double mph = Double.parseDouble(sc.nextLine());
			
		// Calculate hours and minutes to drive.
		// Time = Distance / Speed
		Double hours = miles / mph;
		Integer minutes = (int) (hours * 60);
		Integer hoursInt = minutes/60;
		minutes = minutes % 60;
		System.out.println();
		
		// Display hours and minutes.
		System.out.println("Estimated travel time");
		System.out.println("---------------------");
		System.out.println("Hours:   " + hoursInt);
		System.out.println("Minutes: " + minutes);
		
		// Outro
		System.out.println();
		System.out.print("Bye!!");
		
		sc.close();
	}

}
