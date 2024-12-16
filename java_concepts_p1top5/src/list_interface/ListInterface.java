package list_interface;
import java.util.*;
public class ListInterface{
	public static void main(String args[]){
		List<String>vowels=new ArrayList<String>(25);
		//add example
		vowels.add("A");
		vowels.add("l");
		//let's insert E between A and l
		vowels.add(1,"E");
		List<String>list=new ArrayList<String>();
		list.add("O");
		list.add("U");
		//Appending list elements to letters
		vowels.addAll(list);
		System.out.println("Elements in vowel list after using addAll()= "+vowels);
		//clear example to empty list
		System.out.println("Before clear method the list object element= "+list);
		list.clear();
		System.out.println("After clear method the list object element= "+list);
		//size example
		System.out.println("Vowels List size= "+vowels.size());
		//Update elements in a List using set
		vowels.set(2,"X");
		System.out.println("Elements in vowels list after using set()"+vowels);
		//Extracting a portion of a list
		/*The subList(fromIndex,toindex)allows us to get a portion of the list between the
		specified fromindex(inclusive)and toinsex(exclusive)*/
		list=vowels.subList(2, 4);
		System.out.println("Elements in Vowels List = "+vowels+",Elements in list="+list);
		System.out.println();
		vowels.set(0,"A");
		System.out.println("Elements in Vowels List = "+vowels+",Elements in list="+list);
		list.add("U");
		System.out.println("Elements in Vowels List = "+vowels+",Elements in list="+list);
		System.out.println();
		list.add("A");
		//Removing elements from the list
		System.out.println("Elements in list before remove()= "+list);
		if(list.remove("A")) {
			System.out.println("ELEMENT A IS REMOVED");
		}
		else {
			System.out.println("There is no such element");
		}
		System.out.println("Elements in list after remove()= "+list);
		System.out.println();
		vowels.add("O");
		vowels.add("U");
		vowels.add("A");
		vowels.add("U");
		System.out.println();
		System.out.println("Elements in vowels list= "+vowels);
		System.out.println();
		//Searching for an element in a list
		if(vowels.contains("U")) {
			System.out.println("Found the element");
		}
		else {
			System.out.println("There is no such elemet");
		}
		System.out.println();
		int firstIndex=vowels.indexOf("A");
		System.out.println("First index of A is: "+firstIndex);
		System.out.println();
		int lastindex=vowels.lastIndexOf("U");
		System.out.println("Last index of U is: "+lastindex);
		//sorting
		System.out.println();
		System.out.println("listStrings before sorting: "+vowels);
		Collections.sort(vowels);
		System.out.println("listStrings after sorting: "+vowels);
		System.out.println();
		//copying elements from one list into another
		List<String> sourceList=new ArrayList<String>();
		sourceList.add("A");
		sourceList.add("B");
		sourceList.add("C");
		sourceList.add("D");
		List<String> destList=new ArrayList<String>();
		destList.add("V");
		destList.add("W");
		destList.add("X");
		destList.add("Y");
		destList.add("Z");
		System.out.println("destList before copy: "+destList);
		Collections.copy(destList, sourceList);
		//Shuffling elements in a list
		System.out.println("Vowels List before shuffling: "+vowels);
		Collections.shuffle(vowels);
		System.out.println("Vowels List after shuffling: "+vowels);
		System.out.println();
		//Reversing an array
		System.out.println("Vowels list before reversing: "+vowels);
		Collections.reverse(vowels);
		System.out.println("Vowels list after reversing: "+vowels);
		System.out.println();	
	}
}