/* Aim:-Write a Java Program using Lambda Expression to calculate following:-
a. Convert Fahrenheit to Celcius.
b. Convert Kilometers to Miles.*/

package lambda_expression;

interface KilometersToMiles {
	double convert(double km);
}
public class DistanceConversion {
	public static void main(String[] args) {
		KilometersToMiles convert=km -> km*0.621371;
		System.out.println("Miles: "+convert.convert(10));
	}
}