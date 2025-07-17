package StartSel;

import java.awt.SystemTray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class corejava {

	public static void main(String[] args) {
		
		//integer integerVariable(this will store the whole numbers)
		int myNum = 11;
		//dataType(used to shore a sequence of characters in java)
		//soul (this is the variable name{INDENTIFIER}you've chosen)
		//born---this is a string literal , the actual text value youre assigning.
		
		String soul = "born for this date's birthday baby";
		//char(character)must use single quotes,not double quotes.
		char leter = 'd';
		//data type, object, values
		double dec = 11.09;
	
		boolean mycard = true;
		
		System.out.println( myNum+soul);
		
		//Arrays traditional one
	 
		String[] something = new String[3];
		something[0] = "mad";
		something[1] = "max";
		something[2] = "man";
		System.out.println(something [0]+ something[1]);
		//loop
		for(int s = 0 ; s < something.length; s++) {
			System.out.println(something[s]);
		}
		//enhanced
		for(String E: something) {
			System.out.println(E);
		}
	 
		
		int[]  arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		System.out.println(arr[3]-arr[1]);
		//for loop
				for(int i = 0; i<arr.length;i++)
				{
			
				System.out.println(arr[i]);
				}
				//enhance
				for(int d : arr){
					System.out.println(d);
				}

		int[] arr2 = {1,2,3,4,5,11,20,7};
		//udemy project 
		int totalElements = arr2.length;
		System.out.println("total numbers of elements: " + totalElements);
		
		
		System.out.println(arr2[6]);
	
		for(int i = 0; i< arr2.length;i++)
		{
			System.out.println(arr2[i]);
		}
		for(int i : arr2) {
			System.out.println(i);
		} 
		
		 
		
		String[] name = {"santoman","dhras","infinite"};
		for(int i=0;i<name.length;i++)
		{
		System.out.println(name[i]);
		}
		for (String r : name) {
			System.out.println(r);
		}
		
		
		
		String[] ary = {"santo","joo","boy"};
		for(int i=0;i<ary.length;i++)
		{
			System.out.println(ary[i]);
		}			
         //enhanced for loop syntax
		//for (type variable : collection) {
		    // use variable
		//}

		
		for(String s : ary)
		{
			System.out.println(s);
		}
		{
			
		}
		//practice
		String[] mode = new String[3];
		mode[0] = "santo";
		mode[1] = "man";
		mode[2] = "gonnarock";
		
		int total = mode.length;
		System.out.println(total);
		System.out.println(mode[0] + mode[2]);
		for(int i = 0; i<mode.length;i++) {
			System.out.println(mode[i]);
			}
		for(String e: mode ) {
			System.out.println(e);
		}
		
		//
		for(int i= mode.length-1;i>=0;i-- ) {
			System.err.println(mode[i]);
		}
		//
		
		String[] them = {"kanne","penne","enney"};
		List<String> have =Arrays.asList(them);
		if(have.contains("kanna")) {
	    		System.out.println("it is there");
	    		
	    	}
	    	else{
                System.out.println("it not");
	    	}
	
	    ArrayList<String> cham = new ArrayList<String>();
	    cham.add("the");
	    cham.add("matter");
	    cham.add("on");
	    int most = cham.size();
	    System.out.println(most);
	    for(String lean: cham) {
	    	System.out.println(lean);
	    }
	    if (cham.contains("matt0er")) {
	    	System.out.println("im here");
	    }
	    else {
	    	System.out.println("not");
	    }
	    String make = "im the king";
	    String[] splitedmenu = make.split(" ");
	    for(String mi: splitedmenu) {
	    	System.out.println(mi);	
	    }
	    String hog = "the most wantedone";
	    String[] army = hog.split("most");
	    for(String war: army) {
	    	System.out.println(war);
	    }
	    System.out.println(army[1].trim());
	    //
	    for(int i = 0; i<hog.length();i++) {
	    
	    System.out.println(hog.charAt(i));
	    }
	    }
	    	
	    
		
		
		}


