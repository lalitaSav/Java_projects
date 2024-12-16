package lambda_expression;
interface Hello {
	void sayHello();
}
public class HelloWorld {
public static void main(String[] args) {
	Hello hello=()->System.out.println("Hello World");
	hello.sayHello();
	}
}