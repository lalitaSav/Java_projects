//Write a JAVA program to create a set containing list of items as type string 
//and print the items in the list using iterator interface. Also print the list 
//in reverse/ backward direction.

package set_interface;
import java.util.*;
public class setExample {
	public static void main(String[] args) { 
		Set<String> itemSet=new HashSet<>(); 
		itemSet.add("Apple"); 
		itemSet.add("Banana"); 
		itemSet.add("Cherry"); 
		itemSet.add("Date"); 
		itemSet.add("Elderberry"); 
		System.out.println("Items in the set:"); 
		Iterator<String>iterator=itemSet.iterator(); 
		while (iterator.hasNext()){
			System.out.println(iterator.next());
		}
		List<String>itemList=new ArrayList<>(itemSet); 
		System.out.println("\nItems in reverse order:"); 
		for(int i= itemList.size() -1;i>=0;i--) {
			System.out.println(itemList.get(i));
		}
	}
}
