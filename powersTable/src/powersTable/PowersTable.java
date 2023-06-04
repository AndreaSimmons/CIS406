// Andrea Simmons, CIS406, Powers Table Lab Week 6

package powersTable;
import java.util.*;

public class PowersTable
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		// Display welcome message.
        System.out.println("Welcome to the Squares and Cubes table\n");

        // create the Scanner object
        Scanner sc = new Scanner(System.in);

        // Perform conversions until choice isn't equal to "y" or "Y"
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) 
        {
            // Get an integer from the user.
            System.out.print("Enter an integer: ");
            int num = Integer.parseInt(sc.nextLine());
            System.out.println();

            // Create a string that will simulate a table.

            String table = "";
            // Append the column header to the table.
            table += "Number\tSquared\tCubed\n";
            table += "======\t=======\t=====\n";

            // Write a 'for' loop starting at 1 to the value of the integer entered, increment by 1.
            for (int i = 1; i <= num; i++) 
            {
                int square = i * i;
                int cube = i * i * i;
                table += i + "\t" + square + "\t" + cube + "\n";
            }

            // Display the table
            System.out.println(table);

            // see if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.nextLine();
            System.out.println();
        }
        System.out.println("Bye!!");
        sc.close();
	}
}