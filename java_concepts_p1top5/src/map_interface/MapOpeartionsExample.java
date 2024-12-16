/* Aim:Write down a Java Program using Map Interface containing list of items having keys
and associated values and perform the following operations:
a. Add items in the map
b. Remove items from the map
c. Search specific key from the key
d. Insert map elements of one map into another map.
e. Insert map elements of one map into another map.
f. Print all keys and values of the map */

package map_interface;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
public class MapOpeartionsExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//Create a Map to store items
		Map<String, String> itemMap= new HashMap<>();
		
		//a.Add items to the map
		System.out.println("Adding items to the map. Type 'exit' to stop adding.");
		while (true) {
			System.out.print("Enter key:");
			String key= scanner.nextLine();
			if(key.equalsIgnoreCase("exit")){
				break;
			}
			System.out.print("Enter value:");
			String value= scanner.nextLine();
			itemMap.put(key, value);
		}
		
		//b.remove items form the map
		System.out.print("\nEnter key to remove from the map:");
		String keyToRemove= scanner.nextLine();
		if(itemMap.remove(keyToRemove)!=null) {
			System.out.println(keyToRemove+"removed from the map.");
		}
		else {
			System.out.println(keyToRemove+" not found in the map.");
		}
		
		//d.Get value of the specific key in map
		System.out.print("\nEnter key to search from the map:");
		String keyToSearch= scanner.nextLine();
		if(itemMap.containsKey(keyToSearch)) {
			System.out.println(keyToSearch+"removed from the map.");
		}
		else {
			System.out.println(keyToSearch+" is not found in the map.");
		}
		System.out.print("\nEnter key to get this value:");
		String keyToGetValue=scanner.nextLine();
		String value=itemMap.get(keyToGetValue);
		if(value !=null) {
			System.out.println("Value for key "+keyToGetValue+"' is: "+value);
		}
		else{
			System.out.println("key '"+keyToGetValue+"' not found.");
		}
		
		//e.Insert elements of one map into another map
		Map<String, String> anotherMap = new HashMap<>();
		anotherMap.put("Orange","Frut");
		anotherMap.put("carrot", "vegetables");
		itemMap.putAll(anotherMap);
		System.out.println("\nItems after inserting another map: "+itemMap);
		
		//f.print all keys and values of the map
		System.out.println("\nAll keys and values in the map");
		for(Entry<String, String> entry:itemMap.entrySet())
		{System.out.println(" key: "+entry.getKey()+", VALUE: "+entry.getValue());}
		scanner.close();
	}
	
}