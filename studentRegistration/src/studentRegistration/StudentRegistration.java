//Andrea Simmons, CIS406, Student Registration Lab

package studentRegistration;
import java.util.Scanner;

public class StudentRegistration
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println("Student Registration Form");
		System.out.println();
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.print("Enter first name: ");
		String firstName = scnr.next();
		
		System.out.print("Enter last name: ");
		String lastName = scnr.next();
		
		System.out.print("Enter year of birth: ");
		int birthYear = scnr.nextInt();
		
		String name = firstName + " " + lastName;
		String password = firstName + "*" + birthYear;
		
		
		System.out.println();		
		System.out.println("Welcome " + name + "!");
		System.out.println("Your registration is complete.");
		System.out.println("Your temporary password is: " + password);
		
		scnr.close();
		

	}

}
