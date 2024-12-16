package generics; 
import java.util.*; 
public class WildCard{
    static void processElements(ArrayList<?>a){
    for(Object element:a){
        System.out.println(element);
        }
    }
    public static void main(String[] args){
        ArrayList<Integer>a1=new ArrayList<>(); a1.add(10);
        a1.add(20);
        a1.add(30); 
        processElements(a1);
        ArrayList<String>a2=new ArrayList<>(); 
        a2.add("ONE");
        a2.add("TWO");
        a2.add("THREE");
        processElements(a2);
    }
}
