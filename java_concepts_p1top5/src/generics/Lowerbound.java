package generics;
import java.util.*;
public class Lowerbound{
	static void processElements(ArrayList<? super Integer>a){
		for(Object element:a){
			System.out.println(element);
		}
	}
	public static void main(String args[]){
		ArrayList<Integer> a1=new ArrayList<>(); 
		a1.add(10);
		a1.add(20);
		a1.add(30); 
		processElements(a1);
		ArrayList<Double>a2 = new ArrayList<>(); 
		a2.add(21.35);
		a2.add(56.47);
		a2.add(78.12);
	}
}
