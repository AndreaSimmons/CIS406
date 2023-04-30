// Andrea Simmons, CIS406, Temperature Conversion Lab

package temperatureConversion;
import java.text.NumberFormat;
import java.util.*;

public class TemperatureConversion
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		// Enter a temperature in Fahrenheit
		System.out.println("Welcome to the Temperature Converter");
		System.out.println();
		
		// Create the Scanner object.
		Scanner sc = new Scanner(System.in);
		
		// Enter a temperature in Fahrenheit
		System.out.print("Enter degrees in Fahrenheit: ");
		Double dF = Double.parseDouble(sc.nextLine());
			
		// Convert the temperature to Celsius using the following formula:
		// Subtract 32 from the Fahrenheit temperature and multiply the result by 5/9.
		Double dC = (dF - 32) * 5/9;
		
		// Format Celsius value.
		NumberFormat number = NumberFormat.getNumberInstance();
		number.setMaximumFractionDigits(2);
		String dCstring = number.format(dC);
		
		// Display the Celsius temperature.
		System.out.print("Degrees in Celsius: " + dCstring);
		System.out.println();
		System.out.println();
		
		// Enter a temperature in Celsius.
		System.out.print("Enter degrees in Celsius: ");
		Double dCel = Double.parseDouble(sc.nextLine());
		
		// Convert the temperature to Fahrenheit using the following formula:
		// Multiply the Celsuis temperature by 9/5 and add 32 to the result.
		Double dFah = (dCel * (9/5)) + 32;
		
		// Format Fahrenheit value.
		NumberFormat number1 = NumberFormat.getNumberInstance();
		number1.setMaximumFractionDigits(2);
		String dFahString = number1.format(dFah);
				
		// Display the Fahrenheit temperature.
		System.out.print("Degrees in Fahrenheit: " + dFahString);
		System.out.println();
		
		// Complete
		System.out.println();
		System.out.print("Bye!!");

		
	}

}
