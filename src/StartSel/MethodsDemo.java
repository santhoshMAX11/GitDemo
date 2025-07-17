package StartSel;

public class MethodsDemo {

	public static void main(String[] args) {
	
		//special care needed
    MethodsDemo d = new MethodsDemo();
    String name = d.getData();
    System.out.println(name);
   
    //call a method that returns something (getData())
    //Store the result(return) in a variable (name)
    //Use it wherever needed (like printing)
    
   
    //another class method is here!
    MethodDemo2 d1 = new MethodDemo2();
    d1.getuserData();
    String name1 = d1.getuserData();
    System.out.println(name1);
    
    //using Static , without a object name ,directly using the method
    getData2();
    
    //Practice
    
    MethodsDemo hog = new  MethodsDemo();
    String rider = hog.gethog();
    System.out.println(rider);
 //
    gethog();
    
    
	}

	    //public - can access by any other class
		//void means there is nothing
		//getData() is method
		
	public String getData()
	{
		System.out.println("hello World");
		return "anybody is there";
	}
	public static  String getData2()
	{
		System.out.println("hello World 2");
		return "yeah man";
	}
	
	public static String gethog() {
		System.out.println("be kind");
		return "ill be";
		
		
	}
	
	
}
