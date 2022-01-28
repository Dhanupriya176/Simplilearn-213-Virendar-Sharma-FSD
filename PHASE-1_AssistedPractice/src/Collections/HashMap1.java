package Collections;

import java.util.*;

public class HashMap1 {

	public static void main(String[] args){
		
		//LinkedHashSet<String> has=new LinkedHashSet<String>();
	HashMap fruits =new HashMap();
		
		fruits.put("1","mango");
		fruits.put("2","orange");
		fruits.put("3","apple");
		fruits.put("4","grapes");
		fruits.put("5","pears");
		fruits.put("6","dragon");
		fruits.put("7","kiwi");
		fruits.put("8","guava");
		fruits.put("9","watermelon");
		fruits.put("10","banana");
				
		System.out.println("HashMap is "+fruits);
		System.out.println("Size of HashMap is "+ fruits.size());
        fruits.remove("4");
        fruits.remove("7");

        System.out.println("After removal process, the hashmap is "+fruits);
        System.out.println("Size of HashMap is "+ fruits.size());

        System.out.print(fruits.containsValue("apple"));
        System.out.print(fruits.containsValue("banana"));
        
        System.out.print(fruits.containsKey("4"));
        fruits.clear();
        System.out.println("\nContent of LinkedHashMap after clearing: " + fruits);
    }

   
	    
		
	}

	







