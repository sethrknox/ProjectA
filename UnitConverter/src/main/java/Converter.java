
import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {
		int menuSelection = 0;
		Scanner scanner = new Scanner(System.in);
		
		while (menuSelection != 5) {
			System.out.println("Please select an option:");
			System.out.println("1. Miles to Kilometers");
			System.out.println("2. Kilometers to Miles");
			System.out.println("3. Farenheit to Celsius");
			System.out.println("4. Celsius to Farenheit");
			System.out.println("5. Quit");
			
			menuSelection = scanner.nextInt();
			
			double unit1 = 0;
			double unit2 = 0;
			String finalUnit = null;
			
			switch(menuSelection) {
			case 1: {
				unit1 = collectQuantity("miles", "kilometers", scanner);
				unit2 = convertMilesToKilometers(unit1);
				finalUnit = " Kilometer(s)";
				break;
			}
			case 2: {
				unit1 = collectQuantity("kilometers", "miles", scanner);
				unit2 = convertKilometersToMiles(unit1);
				finalUnit = " Mile(s)";
				break;
			}
			case 3: {
				unit1 = collectQuantity("degrees Farenheit", "Celsius", scanner);
				unit2 = convertFarenheitToCelsius(unit1);
				finalUnit = " degrees Celsius";
				break;
			}
			case 4: {
				unit1 = collectQuantity("degrees Celsius", "Farenheit", scanner);
				unit2 = convertCelsiusToFarenheit(unit1);
				finalUnit = " degrees Farenheit";
				break;
			}
			case 5: {
				break;
			}
			}
			
			if (menuSelection != 5) {
				System.out.println(unit2 + finalUnit);
			} else {
				System.out.println("Closed program.");
			}
		}
		
		scanner.close();
	}
	
	private static double collectQuantity(String unit1, String unit2, Scanner s) {
		System.out.println("Input the number of " + unit1 + " to be converted to " + unit2);
		double qty = s.nextDouble();
		return qty;
	}
	
	public static double convertCelsiusToFarenheit(double qty) {
		return (((qty / 5) * 9) + 32);
	}
	
	public static double convertFarenheitToCelsius(double qty) {
		return (((qty - 32) * 5) / 9);
	}
	
	public static double convertMilesToKilometers(double qty) {
		return qty * 1.609;
	}
	
	public static double convertKilometersToMiles(double qty) {
		return qty / 1.609;
	}
}
