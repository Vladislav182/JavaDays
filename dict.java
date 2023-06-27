package Canyon;

import java.util.Dictionary;
import java.util.Scanner;
import java.util.Hashtable;
public class dict {
public class hash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// realization of Dictionary with Hashtable:
        //Dictionary: key : value
        Dictionary<Integer, String> MyDictionary = new Hashtable<>();
        //            key : value
 
 
        //using several dictionary methods:
 
 
        // use method to put elements in the dictionary:
        MyDictionary.put(1,"Monday");
        MyDictionary.put(2,"Tuesday");
        MyDictionary.put(3,"Wednesday");
        MyDictionary.put(4,"Thursday");
        MyDictionary.put(5,"Friaday");
        MyDictionary.put(6,"Saturday");
        MyDictionary.put(7,"Sunday");
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 
        // print the size of the dictionary:
        System.out.println("Size of my dictionary is: " + MyDictionary.size());
        System.out.println();
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 
        //using method get:
        System.out.println("Value at key 1 is: " + MyDictionary.get(1));
        System.out.println("Value at key 2 is: " + MyDictionary.get(2));
        System.out.println("Value at key 3 is: " + MyDictionary.get(3));
        System.out.println("Value at key 4 is: " + MyDictionary.get(4));
        System.out.println("Value at key 5 is: " + MyDictionary.get(5));
        System.out.println("Value at key 6 is: " + MyDictionary.get(6));
        System.out.println("Value at key 7 is: " + MyDictionary.get(7));

        System.out.println();
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 
        System.out.println("My dictionary before removing two elements: " + MyDictionary);
        System.out.println();
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 
        //using isEmpty method
        System.out.println("Is my dictionary empty? - " + MyDictionary.isEmpty());
        System.out.println();
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 
        //using method remove() and removing values at key 1 and 2
        MyDictionary.remove(1);
        MyDictionary.remove(2);
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 
        //check if the removed elements exists in the dictionary:
        System.out.println("Checking if the removed value exist - " + MyDictionary.get(1));
        System.out.println("Checking if the removed value exist - " + MyDictionary.get(2));
        System.out.println();
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 
        //print the dictionary after removing the elements:
        System.out.println("After removing two elements: " + MyDictionary);
 
        System.out.println();
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 
        //using method size:
        System.out.println("The new size of dictionary is: " + MyDictionary.size());
 
    }//end of main
//end of the class
 

	}


