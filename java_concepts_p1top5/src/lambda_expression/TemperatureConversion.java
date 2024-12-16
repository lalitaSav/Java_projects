/*Aim:-Write a Java Program using Lambda Expression to calculate following:-
a. Convert Fahrenheit to Celcius.
b. Convert Kilometers to Miles.*/

package lambda_expression;
interface FahrenheitToCelcuis{
	double convert(double fahrenheit);
}
public class TemperatureConversion{
	public static void main (String[] args){
		FahrenheitToCelcuis convert=f->(5.0/9)*(f-32);
		System.out.println("Celcuis: "+convert.convert(98.6));
	}
}


