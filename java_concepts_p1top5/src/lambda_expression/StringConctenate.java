package lambda_expression;

interface Concatenate{
	String join(String s1,String s2);
}
public class StringConctenate{
	public static void main(String[] args){
		Concatenate concat=(s1,s2)->s1+s2;
		System.out.println(concat.join("hello"," world"));
	}
}