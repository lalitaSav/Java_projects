package lambda_expression;

interface SingleParameter {
	void display(String message);
}
public class SingleParameterExample {
	public static void main (String[] args) {
		SingleParameter displayMessage=message->System.out.println("Message:"+message);
		displayMessage.display("Lambda with single parameter");
	}
}