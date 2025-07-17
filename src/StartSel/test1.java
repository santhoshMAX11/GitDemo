package StartSel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class test1 {

	public static void main(String[] args) {
		
                    //count the number of names starting with alphabet A in list
					ArrayList<String> names= new ArrayList<String>();
					names.add("arun");
					names.add("john");
					names.add("afith");
					names.add("alien");
					names.add("anath");
					
					//regular method 
					int count = 0;
					for(int i=0;i<names.size();i++) {
					String selected=names.get(i);
					if(selected.startsWith("a")) {
						count++;    
						}
					}
					System.out.println(count);
					
					
					//*Converts the list names into a Stream.
					//Stream allows us to process data in a modern, clean way (like a pipeline).
					long list= names.stream().filter(s->s.startsWith("a")).count();//when a count is present in the code sysout is not available in the end and it should be send separately
					//*This filters (keeps) only those strings that start with "a".
                    //s -> s.startsWith("a") is a lambda expression, meaning: "for every string s, keep it if it starts with 'a'"
                    
				    //*count()--> there is no life for intermediate operator , if there is no terminal op
					//terminal operation will execute only if inter operator (filter) returns true 
					
					System.out.println(list);
					
					//we can create a stream using stream api
					//light weight stream compatible collection
				    long d=	Stream.of("arun","john","afith","alien","anath").filter(s->s.startsWith("a")).count();
					//because of count present in the string we are creating a object to act sysout seperatly
		
		             System.out.println(d);
		//just to show this is method is avaialbe , this code can be written in one line itself , as we saw before
		
		//print the name which are greater than 4
		//names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		System.out.println("**************");

		//just to print first letter
		names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
		
		
		//Test [Map]
		//Print names which have last letter as "a" with uppercase
		Stream.of("Sana","Menna","Rock","Tongue","rosa").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		
		//array into arraylist
		String[] topic =  {"arun","john","afith","alien","anath"};
		//print names which have first letter as "a" with uppercase and sorted
		List<String> name= Arrays.asList(topic);
		name.stream().filter(s->s.startsWith("a")).sorted().map(s->s.toUpperCase())
		.forEach(s->System.out.println(s));
		
		//dummy string for example
		ArrayList<String> names11= new ArrayList<String>();
		names11.add("stokes");
		names11.add("ben");
		names11.add("root");
		names11.add("archer");
		names11.add("wokes");

		System.out.println("**************");
		
		//MERGING THE TWO DIFFERENT LIST INTO ONE
        Stream<String> newStream= Stream.concat(name.stream(), names11.stream());
		// when you study unlock and see below code
      //  newStream.sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
        //to check whether the particular word is presented or not 
       boolean england= newStream.anyMatch(s->s.equalsIgnoreCase("stokes"));
	   System.out.println(england);
	   Assert.assertTrue(england);
		
		
	   //StreamCOLLECT()
	   List<String> testmatch=  names.stream().filter(s->s.length()>4).sorted().map(s->s.toUpperCase())
	   .collect(Collectors.toList());
		System.out.println(testmatch);
		
		
		//print unique number from this array
		//sort the array
		List<Integer> i= Arrays.asList(2,3,4,5,2,3,8,9,4,7,6,6);
		
		//for all//i.stream().distinct().sorted().forEach(s->System.out.println(s) );
	List<Integer> list1 =	i.stream().distinct().sorted().collect(Collectors.toList());
	//The method .distinct() is used to remove duplicate elements from the stream.
	System.out.println(list1.get(3));
	
	//
	Stream.of("benjamin","anderson").filter(s->s.endsWith("n")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	}

}
