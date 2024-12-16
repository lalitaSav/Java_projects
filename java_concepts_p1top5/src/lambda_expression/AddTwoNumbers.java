package lambda_expression;

interface Add {
	int sum(int a, int b);
}
public class AddTwoNumbers {
	public static void main(String[] args) {
		Add addition=(a,b)->a+b;
		System.out.println("Sum: "+addition.sum(5, 10));
	}
}