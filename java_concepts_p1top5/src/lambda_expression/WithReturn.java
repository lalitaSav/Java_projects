/*Aim:-Write a Java Program using Lambda Expression with and without return keyword.
a) With return keyword */

package lambda_expression;
interface Multiply{
	int product(int a, int b);
}
public class WithReturn {
	public static void main(String[] args) {
		Multiply multiply=(a,b)-> {
			return a*b;
		};
		System.out.println("Product: "+multiply.product(5, 4));
	}
}