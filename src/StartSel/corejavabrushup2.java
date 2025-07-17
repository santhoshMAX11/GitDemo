package StartSel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class corejavabrushup2 {

	public static void main(String[] args) {
		
		Integer[] arr2 = {1,2,3,4,5,11,20,7,144,134,111};
		//normal array into arraylist 
        List<Integer> change = Arrays.asList(arr2);
        
        System.out.println(change);
        System.out.println(change.contains(11));
        //Always use Integer instead of int when working with collections like List, ArrayList, etc., because Java collections only support object types, not primitive typ 
        //Let me know if you'd like to use .contains() or filtering even numbers in this converted list!
		//2,4,20,144,134
		
		for(int i=0; i<arr2.length;i++)
		{
			if(arr2[i] % 2==0)
			{
				System.out.println(arr2[i]);
			}
			//or else
			else
			{
				System.out.println(arr2[i]+ "is not multiple of 2");
				
			}
		
		}
		
		//BREAK; is implemented here!
		for(int i=0; i<arr2.length;i++)
		{
			if(arr2[i] % 2==0)
			{
				System.out.println(arr2[i]);
				break;
			}
			//or else
			else
			{
				System.out.println(arr2[i]+ "is not multiple of 2");
				
			}
		}

		// ARRAYLIST METHORD
		//“Arrays are useful when the data is fixed in size, and you want faster access or performance, like storing fixed input sets. ArrayLists are more flexible because they can grow or shrink as needed, which makes them great for dynamic test data or handling collections where the size isn’t known upfront.
		//As a QA engineer, knowing this helps me understand how the system processes data, and it guides me to test edge cases like empty lists, dynamic additions, or boundary issues in arrays.”

		ArrayList<String> d = new ArrayList<String>();
		d.add("santoman");
		d.add("is a");
		d.add("good kind hearted human");
		d.add("be kind");
		System.out.println(d.get(0) + d.get(1) + d.get(2) + d.get(3));
		
		//loop
		for(int i =0; i<d.size(); i++) {
			
			System.out.println(d.get(i));
		}
		System.out.println("Breaker");
		// enhanced loop
		for(String value :d) {
			System.out.println(value);	
		}
	
		
	    //this is simple
		//item is present in ArrayList(using boolean methord)
		System.out.println(d.contains("be kind"));
		
		System.out.println(d.contains("hate"));
		
		//change the normal array into ArrayList
		String[] ary = {"santo","joo","boy"};
		List<String> changearyintoarylist = Arrays.asList(ary);
		System.out.println( changearyintoarylist.contains("santo"));
		
		//item is present in ArrayList using if
				//if condition in Arraylist
				if (d.contains("be king")) {
					System.out.println("be kind is present");
				}
				//else
				else {
					System.out.println("is not presented");
				}
				
		
		
	}

}
