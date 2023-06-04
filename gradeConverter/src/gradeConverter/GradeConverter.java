// Andrea Simmons, CIS406, Grade Converter Week 6 Lab

package gradeConverter;
import java.util.Scanner;

public class GradeConverter
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		// display a welcome message
		System.out.println("Welcome to the Letter Grade Converter");
		System.out.println();
		Scanner sc = new Scanner(System.in);

		// Create a 'while' loop that will continue until the user enters 'n' or 'N'.
		// It is easier to make the 'while' loop based on 'y' or 'Y' so the program will
		// complete if the user does not input 'y' or 'Y'.
		String cont = "y";
		while (cont.equalsIgnoreCase("y")) 
		{
			// Get numerical grade from user.
			System.out.print("Enter numerical grade: ");
			int numericalGrade = Integer.parseInt(sc.nextLine());

			// Convert numerical grade to letter grade.
			String letterGrade = "";
			if (numericalGrade >= 90)
				letterGrade = "A";
			else if (numericalGrade >= 80)
				letterGrade = "B";
			else if (numericalGrade >= 70)
				letterGrade = "C";
			else if (numericalGrade >= 60)
				letterGrade = "D";
			else
				letterGrade = "F";

			// Display the letter grade.
			System.out.print("Letter grade: " + letterGrade + "\n");

			// see if the user wants to continue
			System.out.print("Continue? (y/n): ");
			cont = sc.nextLine();
			System.out.print("");
		}
		System.out.println("Bye!!");
		sc.close();
	}
}