/*Aim:-Write a program using Set Interface containing List of items and perform the
following Operations
a. Add items in the set
b. Insert items of one set into other set.
c. Remove items from the set.
d. Search the specified item in a set */


package set_interface;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class setOperationExample{
	public static void main(String[]args){
		Scanner scanner=new Scanner(System.in);
		Set<String> itemSet=new HashSet<>();
		System.out.println("Adding items to the set. Type 'exit' to stop adding.");
		while (true){
			System.out.println( "Enter item: ");
			String item=scanner.nextLine();
			if(item.equalsIgnoreCase("exit")){
				break;
			}
			itemSet.add(item);
		}
		//b. Insert items of one set into another
		Set<String> anotherSet=new HashSet<>();
		anotherSet.add("Grapes");
		anotherSet.add("Orange");
		anotherSet.add("Pineapple");
		anotherSet.addAll(anotherSet);
		System.out.println("\nItems after inserting another set: "+itemSet);
		
		//c.Remove items from the set
		System.out.print("\nEnter the items to be removed: ");
		String itemToRemove=scanner.nextLine();
		if(itemSet.remove(itemToRemove)){
			System.out.println(itemToRemove+" removed from the set.");
		}
		else {
			System.out.println(itemToRemove+"not found in the set.");
		}
		System.out.println("current items in the set: "+itemSet);
		
		//d.search a specified item
		System.out.println( "Enter item to be searched: ");
		String itemToSearch=scanner.nextLine();
		if(itemSet.contains(itemToSearch)){
			System.out.println(itemToSearch+" is found in the set.");
		}
		else {
			System.out.println(itemToSearch+" not found in the set.");
		}
		//close scanner
		scanner.close();
	}
}