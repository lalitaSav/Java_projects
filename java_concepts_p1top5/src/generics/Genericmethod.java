package generics; 
public class Genericmethod{
    public static<E> void printArray(E[]arr){
        for(E element :arr){
            System.out.printf("%S",element); System.out.println();
        }
    }
    public static void main(String[]args){
        Integer[] intarr= {1,2,3,4,5};
        Double[] darr= {1.1,2.1,3.1,4.1,5.1};
        Character[]carr= {'H','e','l','l','o'}; 
        System.out.println("IntegerArray: "); 
        printArray(intarr); 
        System.out.println("DoubleArray: "); 
        printArray(darr); 
        System.out.println("CharacterArray: "); 
        printArray(carr);
    }
}
