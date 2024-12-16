/* Aim:-Write a Java Program using Lambda Expression with and without return keyword.
a) Without return keyword Code */

package lambda_expression;
interface Subtract {
	int difference(int a,int b);
}
public class WithoutRetrun {
	public static void main(String[] args) {
		Subtract subtract=(a,b)->a-b;
		System.out.println("Difference: "+subtract.difference(10, 4));
	}
}