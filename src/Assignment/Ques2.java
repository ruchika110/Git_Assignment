package Assignment;

import java.util.Scanner;

public class Ques2 {

	public static void main(String[] Strings) {
		Scanner input = new Scanner(System.in);

		System.out.print("Input temperature: ");
		double fahrenheit = input.nextDouble();

		double celsius =(( 5 *(fahrenheit - 32.0)) / 9.0);
		System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");
	}
}
