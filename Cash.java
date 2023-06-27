package Canyon;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;
public class Cash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dictionary myDictionary = new Hashtable<Integer , String>();
// key : value

        myDictionary.put(0, "Monday");
        myDictionary.put(1, "Tuesday");
        myDictionary.put(2, "Wednesday");
        myDictionary.put(3, "Thursday");
        myDictionary.put(4, "Friday");
        myDictionary.put(5, "Saturday");
        myDictionary.put(6, "Sunday");

        System.out.println();
        System.out.println();
        
        
        //razmner na rechnika 
         int NumberOfElements = myDictionary.size();
         System.out.println("1. Number of elements : " + NumberOfElements);
         System.out.println();
         
         ///ADDRESS OF KEYS.............................
         for(int i = 0;i< NumberOfElements;i++) 
         {
        	 System.out.println("3. Address of KEYS: " + myDictionary.keys());	 
         }
         System.out.println();
         //ADDRESS OF ELEMENTS - NOT WORK PROPER......................
         for(int i = 0;i< NumberOfElements;i++) 
         {
        	 System.out.println("4. Address of 	VALUES: " + myDictionary.get(myDictionary.keys()));
        	 
         }
         System.out.println();
         //PRINT KEYS-------------------------------
         for(Enumeration i = myDictionary.keys(); i.hasMoreElements();)
         {
        	 System.out.println("5. KEYS in dictionary :" + i.nextElement());
         }
         System.out.println();
         }
}
                  
         
        
        	 
         
         

         
        
        