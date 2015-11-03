import java.util.Scanner;

public class CarDriver {
	private static Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Please enter your engine, color, and horsepower"); 
		// note that this is an extra I created for practice, though not in the assignment I felt it was good to add it a created Cars in here.
		String inputcolor, inputengine, Lamboengine, Lambocolor, convertengine, convertcolor, miniVengine, miniVcolor;
		inputengine = keyboard.next();

		inputcolor = keyboard.next();

		int inputhorsepower = keyboard.nextInt();

		int Lambohorsepower = 260;
		int converthorsepower = 300;
		int miniVanhorsepower = 120;

		Lamboengine = "V8";
		Lambocolor = "blue";
		convertengine = "V12";
		convertcolor = "purple";
		miniVengine = "V1";
		miniVcolor = "gray";
		Car newcar = new Car(inputengine, inputhorsepower, inputcolor);
		Car Lambo = new Car(Lamboengine, Lambohorsepower, Lambocolor);
		Car convertable = new Car(convertengine, converthorsepower, convertcolor);
		Car miniVan = new Car(miniVengine, miniVanhorsepower, miniVcolor);

		System.out.println(miniVan);
		System.out.println(convertable);
		System.out.println(Lambo);
		System.out.println(newcar);
	}
}
