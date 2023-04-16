package vacationDiaryPart1;
import java.util.Scanner;

public class VacationDiaryPart1
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
       System.out.println("Vacation Diary");
       System.out.println();
       
       // create the Scanner object
       Scanner scnr = new Scanner(System.in);
       
       // get the student data
       System.out.print("Enter Date Vacation Started (mm/dd/yyyy): ");
       String dateStarted = scnr.next();
       System.out.print("Enter City Visited: ");
       String city = scnr.next();
       System.out.print("Enter Country Visited: ");
       String country = scnr.next();
       System.out.print("Enter number of days: ");
       int days = scnr.nextInt();
       System.out.print("Enter Mode of Travel (car, airplane, ship, train, bus): ");
       String travelMode = scnr.next();
       
       // create full name and temporary password
       // display the results
       System.out.println();
       System.out.println("Details of your trip:");
       System.out.println("Date: " + dateStarted);
       System.out.println("City: " + city);
       System.out.println("Country: " + country);
       System.out.println("Number of Days: " + days);
       System.out.println("Traveled By: " + travelMode);
       scnr.close();
       System.out.println("Bye!!!");

	}

}
