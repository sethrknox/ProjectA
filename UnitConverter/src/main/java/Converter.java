
import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {
		int menuSelection = 0;
		Scanner scanner = new Scanner(System.in);
		
		while (menuSelection != 3) {
			System.out.println("Please select an option:");
			System.out.println("1. Distance convserions");
			System.out.println("\t Miles to Kilometers");
			System.out.println("\t Kilometers to Miles");
			System.out.println("2. Temperature conversions");
			System.out.println("\t Farenheit to Celsius");
			System.out.println("\t Celsius to Farenheit");
			System.out.println("3. Quit");
			
			menuSelection = scanner.nextInt();
			
			int check = 0;
			switch(menuSelection) {
			case 1: {
				check = distanceConversions(scanner);
				break;
			}
			case 2: {
				check = temperatureConversions(scanner);
				break;
			}
			case 3: {
				System.out.println("Closed program.");
				break;
			}
			default: {}
			}
			
			if (check == 1) {
				menuSelection = 3;
			}
		}
		
		scanner.close();
	}
	
	public static int temperatureConversions(Scanner s) {
		System.out.println("Please select an option:");
		System.out.println("1. Farenheit to Celsius");
		System.out.println("2. Celsius to Farenheit");
		System.out.println("3. Quit");
		
		int menuSelection = s.nextInt();
		int check = 0;
		
		double unit1 = 0;
		double unit2 = 0;
		String startUnit = null;
		String finalUnit = null;
		
		switch(menuSelection) {
		case 1: {
			startUnit = "degrees Farenheit";
			finalUnit = "degrees Celsius";
			unit1 = collectQuantity(startUnit, finalUnit, s);
			unit2 = convertFarenheitToCelsius(unit1);
			break;
		}
		case 2: {
			startUnit = "degrees Celsius";
			finalUnit = "degrees Farenheit";
			unit1 = collectQuantity(startUnit, finalUnit, s);
			unit2 = convertCelsiusToFarenheit(unit1);
			break;
		}
		case 3: {
			check = 1;
			break;
		}
		default:{
			return 0;
		}
		}
		
		if (menuSelection != 3) {
			System.out.println(unit1 + " " + startUnit + " is equal to " + unit2 + " " + finalUnit);
		} else {
			System.out.println("Closed program.");
		}
		
		return check;
	}
	
	public static int distanceConversions(Scanner s) {
		System.out.println("Please select an option:");
		System.out.println("1. Miles to Kilometers");
		System.out.println("2. Kilometers to Miles");
		System.out.println("3. Quit");
		
		int menuSelection = s.nextInt();
		int check = 0;
		
		double unit1 = 0;
		double unit2 = 0;
		String startUnit = null;
		String finalUnit = null;
		
		switch(menuSelection) {
		case 1: {
			startUnit = "Mile(s)";
			finalUnit = "Kilometer(s)";
			unit1 = collectQuantity(startUnit, finalUnit, s);
			unit2 = convertMilesToKilometers(unit1);
			break;
		}
		case 2: {
			startUnit = "Kilometer(s)";
			finalUnit = "Mile(s)";
			unit1 = collectQuantity(startUnit, finalUnit, s);
			unit2 = convertKilometersToMiles(unit1);
			break;
		}
		case 3: {
			check = 1;
			break;
		}
		default:{
			return 0;
		}
		}
		
		if (menuSelection != 3) {
			System.out.println(unit1 + " " + startUnit + " is equal to " + unit2 + " " + finalUnit);
		} else {
			System.out.println("Closed program.");
		}
		
		return check;
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
