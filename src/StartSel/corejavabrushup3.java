package StartSel;

public class corejavabrushup3 {

	public static void main(String[] args) {
		//FIQ
		//string is an object, that represent the sequence of words
		
		//STRING LITERAL
		//datatype, object, that object will store the value
		
		String s = "santo man store";
		String s1 = "santo man store";
		
		// NEW MEMORY ALLOCATE OPERATOR
		String s2 = new String ("welcome");
		String s3 = new String ("welcome");
	
		//In string literal, if you have same multiple values with th same name then it wont create a new object it will store the existing
		
	    // In string new, but here no matter if it is a same value,it will create new object in the memory space
		
		//SPLITTED STRING with white space
		String s5 = "be kind santoman";
		
		String[] splittedString = s5.split(" ");
		//basic methord
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[2]);
		
		
		System.out.println("*************");
		//or and follow this as a main 
		for(String word : splittedString) {
			System.out.println(word);
		}
		
	
		//SPLITED STRING with word(kind)
		String s6 = "be kind man";
		String[] splittedString2 = s6.split("kind");
		System.out.println(splittedString2[0]);
		System.out.println(splittedString2[1]);
		//main 
		for(String taken : splittedString2) {
			System.out.println(taken);
		}
		
        String[] san = {"work","hard", "until", "win"};
		
		for(int i = san.length-1; i>=0;i--) {
			System.out.println(san[i]);
		}
		
		
		//to Trim the white space
	    System.out.println(splittedString2[1].trim());
		
		//to print by character by character(only for string)23
		String s7 = "i love you";
		for(int i=0;i<s7.length();i++) {
		System.out.println(s7.charAt(i));
		}
		//Write the string in reverse order
		for(int i1 = s7.length()-1;i1>=0;i1--) {
		System.out.println(s7.charAt(i1));	
		}
		//practice
		Integer[] s8 = {1,2,3,4,5,6};
		for(int r = 0; r <=s8.length;r++) {
			System.out.println(r);
		}
		
		for (int d=s8.length-1;d>=0;d--) {
			System.out.println(d);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	}
